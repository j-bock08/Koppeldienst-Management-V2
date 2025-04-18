package SqlServices;

import SystemFiles.SqlConnector;
import org.aspectj.lang.annotation.Before;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {

    private static Connection connection = SqlConnector.getConnection();

    public void selectAllUsers() {
        String sqlQuery = "SELECT * FROM User";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void selectUserById() {

    }

}
