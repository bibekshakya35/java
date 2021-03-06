package spring5reactive.spring5reactive.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import reactor.ipc.netty.http.server.HttpServer;

/**
 * Created by bibek on 7/11/17.
 */
@Configuration
public class HttpServerConfig {
    @Autowired
    private Environment environment;

    @Bean
    public HttpServer httpServer(RouterFunction<?> routerFunction){
        HttpHandler httpHandler =
                RouterFunctions.toHttpHandler(
                        routerFunction
                );
        ReactorHttpHandlerAdapter adapter =
                new ReactorHttpHandlerAdapter(httpHandler);
        HttpServer httpServer =
                HttpServer.create("localhost",
                        Integer.valueOf(environment.getProperty("server.port")));
        httpServer.newHandler(adapter);
        return httpServer;
    }

}
