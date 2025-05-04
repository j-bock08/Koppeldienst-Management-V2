package controller;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import requestEndpoints.UserRequests;

public class Controller {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        //context.addServlet(UserRequests.class, "/v1/user/*");

        server.setHandler(context);
        server.start();

        // 👇 Hier bleibt das Programm aktiv
        server.join();
    }

}
