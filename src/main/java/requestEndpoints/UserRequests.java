package requestEndpoints;


import SqlServices.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/v1/user/*")
public class UserRequests extends HttpServlet {

    private final UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        req.getContentType();
        String urlPath = req.getPathInfo();
        String urlStringId = urlPath.substring(1);
        int urlId = 0;


        try {
            resp.getWriter().write("Testausgabe");
            urlId = Integer.parseInt(urlStringId);
        } catch (NumberFormatException e ) {
            System.out.println("Error by converting values to integer.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (urlId != 0) {

            service.selectAllUsers(resp);

        } else {

            service.selectUserById(resp, urlId);

        }

    }
}