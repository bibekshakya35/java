package spring5reactive.spring5reactive.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * Created by bibek on 7/11/17.
 */
@Configuration
public class Routes {
    private UserService userService;

    public Routes(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public RouterFunction<?> routerFunction() {
        return route(GET("/api/users")
                        .and(accept(MediaType.APPLICATION_JSON)),
                userService::handleGetUsers)
                .and(route(GET("/api/user/{id}")
                                .and(accept(MediaType.APPLICATION_JSON)),
                        userService::handleGetUserById));
    }
}
