package spring5reactive.spring5reactive.user;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bibek on 7/10/17.
 */
@Repository
public class UserRepository {
    private final List<User> users
            = Arrays.asList(new User(1L,"Bibek Shakya"),
            new User(2L,"Roshan Shakya"),
            new User(3L,"Abhishek Shakya"));
    public Mono<User> getUserById(long id){
        return Mono.justOrEmpty(users.stream().filter(user->{
            return user.getId().equals(id);
        }).findFirst().orElse(null));
    }
    public Flux<User> getUsers(){
        return Flux.fromIterable(users);
    }

}
