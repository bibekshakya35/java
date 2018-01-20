package designpattern.cor.middleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 */
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");
        //All the check are linked, Client can build various chains using
        //the same component
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware())
                .linkWith(new RoleCheckMiddleware());
        //server gets a chain from client code
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.println("Enter email : ");
            String email = reader.readLine();
            System.out.println("Enter password : ");
            String password = reader.readLine();
            success = server.login(email, password);
        } while (!success);
    }
}
