package requests.requestEndpoints;

import requests.requestServices.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/v1/user/login/*")
public class UserRequests extends HttpServlet {

    private final UserService service = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        service.buildDatabaseConnection();

        try {
            super.service(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        req.getContentType();
        String urlStringId = "";
        int urlId = 0;

        String urlPath = req.getPathInfo();

        if (urlPath != null) {
            urlStringId = urlPath.substring(1);
        }


        try {

            urlId = Integer.parseInt(urlStringId);

        } catch (NumberFormatException e) {
            System.out.println("Error by converting values to integer.");
        }

        if (urlId != 0) {

            service.selectUserById(resp, urlId);

        } else {

            service.selectAllUsers(resp);

        }
    }
}