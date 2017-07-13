package spring5reactive.spring5reactive.user;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by bibek on 7/11/17.
 */
public class UserClient {
    public static void main(String[] args) {
        ClientResponse clientResponse =
                WebClient.create("http://localhost:9000")
                        .get()
                        .uri("/api/user")
                        .accept(MediaType.APPLICATION_JSON)
                        .exchange()
                        .block();
        assert clientResponse.statusCode().value() == 200;
    }
}
