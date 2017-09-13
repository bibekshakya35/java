package DNAfakeserve.route;

import DNAfakeserve.service.DNAService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
/**
 * Created by bibek on 8/11/17.
 */
@Configuration
public class Routes {
    private DNAService dnaService;

    public Routes(DNAService dnaService) {
        this.dnaService = dnaService;
    }
    @Bean
    public RouterFunction<?> routerFunction(){
        return route(
                GET("/alpha/extractions/documents")
                .and(accept(MediaType.APPLICATION_JSON))
                ,dnaService::provideExtraction
        );
    }
}
