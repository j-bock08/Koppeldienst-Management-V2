package SqlServices;

import Objects.Classes.UserObject;
import Objects.Enums.AccStatus;
import SystemFiles.SqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static Connection connection = SqlConnector.getConnection();

    public void selectAllUsers() {
        String sqlQuery = "SELECT * FROM User";

        List<UserObject> importList = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                importList.add(buildUserInstance(resultSet));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //todo return Json Formatted UserList

    }


    public void selectUserById(int id) {

    }

    private UserObject buildUserInstance(ResultSet result) throws SQLException {
        int userId = result.getInt("userId");
        String userName = result.getString("userName");
        String password = result.getString("password");
        AccStatus accStatus = AccStatus.valueOf(result.getString("accStatus"));

        return new UserObject(userId, userName, password, accStatus);
    }

}
