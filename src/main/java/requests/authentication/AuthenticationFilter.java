package requests.authentication;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(urlPatterns = {
    "/v1/user/login/*"
})
public class AuthenticationFilter implements Filter {


    //Todo Filter implementieren der den Token bei allen anderen Requests ausliest
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //casting ServletRequest & Response to Http Type
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        req.getContentType();

        String loginAuthToken = req.getHeader("Authorization");


    }
}
