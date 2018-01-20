package designpattern.cor.middleware;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 */
public class Server {
    private static Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * Client passes a chain of object to server,
     * This improves flexibility
     *
     * @param middleware
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Server gets email and password from client
     * and sends the authorization request to the chain
     *
     * @param email
     * @param password
     * @return
     */
    public boolean login(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful !");
            System.out.println(" YOUR API ID is" + new Random().nextGaussian());
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public static boolean hasEmail(String email) {
        return users.containsKey(email);
    }
}
