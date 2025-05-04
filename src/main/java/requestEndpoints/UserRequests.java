package requestEndpoints;


import SqlServices.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            urlId = Integer.parseInt(urlStringId);
        } catch (NumberFormatException e) {
            System.out.println("Error by converting values to integer.");
        }


        if (urlId != 0) {

            service.selectAllUsers(resp);

        } else {

            service.selectUserById(resp, urlId);

        }

    }
}