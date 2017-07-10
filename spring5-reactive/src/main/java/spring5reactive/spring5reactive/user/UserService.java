package spring5reactive.spring5reactive.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Created by bibek on 7/10/17.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Mono<ServerResponse> handleGetUsers(ServerRequest serverRequest) {
        return ServerResponse.
                ok().body(userRepository.getUsers(), User.class);
    }

    public Mono<ServerResponse> handleGetUserById(ServerRequest serverRequest) {
        return userRepository.getUserById(Long.valueOf(serverRequest.pathVariable("id")))
                .flatMap(user -> ServerResponse.ok().body(Mono.just(user), User.class).switchIfEmpty(ServerResponse.notFound().build()));
    }
}
