package requests.requestEndpoints;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/v1/user/login/*")
public class LoginRequest extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        req.getContentType();





    }
}