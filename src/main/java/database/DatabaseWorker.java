package database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseWorker {
    private static final Logger log = LoggerFactory.getLogger(DatabaseWorker.class.getName());

    Connection connection;
    DbConnectionPool dbConnectionPool;

    public DatabaseWorker() {
        dbConnectionPool = DbConnectionPool.getInstance();
    }

    public ArrayList<String> getCodes(String name, String transport) {
        ArrayList<String> result = new ArrayList<>();
        connection = dbConnectionPool.getConnection();
        try (Statement statement = connection.createStatement()) {
            String command = String.format("SELECT yandex_code FROM transport.stations " +
                    "WHERE name LIKE '%%%s%%' AND transport_type='%s';", name, transport);
            ResultSet resultSet = statement.executeQuery(command);
            while (resultSet.next()) {
                log.debug("Receive code {} for name {} and transport type {}", resultSet.getString(1), name, transport);
                if (!result.contains(resultSet.getString(1)))
                    result.add(resultSet.getString(1));
            }
        } catch (SQLException throwables) {
            log.error(throwables.getMessage());
        }
        dbConnectionPool.putConnection(connection);
        return result;
    }

    public ArrayList<String> getCodes(String name) {
        ArrayList<String> result = new ArrayList<>();
        connection = dbConnectionPool.getConnection();
        try (Statement statement = connection.createStatement()) {
            String command = String.format("SELECT yandex_code FROM transport.stations " +
                    "WHERE name LIKE '%%%s%%';", name);
            ResultSet resultSet = statement.executeQuery(command);
            while (resultSet.next()) {
                log.debug("Receive code {} for name {}", resultSet.getString(1), name);
                if (!result.contains(resultSet.getString(1)))
                    result.add(resultSet.getString(1));
            }
        } catch (SQLException throwables) {
            log.error(throwables.getMessage());
        }
        dbConnectionPool.putConnection(connection);
        return result;
    }

}
