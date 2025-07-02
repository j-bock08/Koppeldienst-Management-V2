package requests.requestServices;

import framework.objects.UserObject;
import framework.enums.AccStatus;
import systemFiles.SqlConnector;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static Connection connection;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void buildDatabaseConnection() {
        connection = SqlConnector.getConnection();
    }

    public void selectAllUsers(HttpServletResponse resp) {
        try {
            String sqlQuery = "SELECT * FROM User";

            List<UserObject> importList = new ArrayList<>();
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                    importList.add(buildUserInstance(resultSet));

                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            resp.getWriter().write(gson.toJson(importList)); //responding values

        } catch (IOException e) {
            resp.setStatus(500);
        }
    }


    public void selectUserById(HttpServletResponse resp, int id) {

    }


    private UserObject buildUserInstance(ResultSet result) throws SQLException {
        int userId = result.getInt("userId");
        String userName = result.getString("username");
        String password = result.getString("password");
        AccStatus accStatus = AccStatus.valueOf(result.getString("accStatus"));

        return new UserObject(userId, userName, password, accStatus);
    }

}