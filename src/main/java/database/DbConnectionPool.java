package database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class DbConnectionPool {
    private static final Logger log = LoggerFactory.getLogger(DbConnectionPool.class.getName());
    private final String username = "root";
    private final String password = "qweqaz123";
    private final String url = "jdbc:mysql://localhost:3306?useSSL=false";
    private final LinkedList<Connection> freeConnections = new LinkedList<>();

    private DbConnectionPool() {}
    private static DbConnectionPool instance = null;
    public static DbConnectionPool getInstance() {
        if (instance == null)
            instance = new DbConnectionPool();
        return instance;
    }

    public Connection getConnection() {
        if (freeConnections.isEmpty()) {
            try {
                log.debug("Create connection to database");
                return DriverManager.getConnection(url, username, password);
            } catch (SQLException throwables) {
                log.error(throwables.getMessage());
            }
        }
        return freeConnections.remove();
    }

    public void putConnection(Connection connection) {
        freeConnections.add(connection);
    }
}
