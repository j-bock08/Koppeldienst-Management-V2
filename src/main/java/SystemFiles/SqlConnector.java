package SystemFiles;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlConnector {

    public static Connection connection;

    public static Connection getConnection() {
        String sqlUrl = ConfigLoader.get("sql.url");
        String sqlUser = ConfigLoader.get("sql.user");
        String sqlPassword = ConfigLoader.get("sql.password");


        try {
            connection = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void closeConnection() throws SQLException {

        if (connection != null) {

            connection.close();

        }
    }

}
