package designpattern.cor.middleware;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 */
public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equalsIgnoreCase("admin@example.com")){
            System.out.println("Hello Admin");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email,password);
    }
}
