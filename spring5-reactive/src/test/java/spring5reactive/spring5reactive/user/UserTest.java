package spring5reactive.spring5reactive.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.FluxExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.io.IOException;
import java.util.List;

/**
 * Created by bibek on 7/11/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void shouldReturnUserList() throws IOException {
        FluxExchangeResult<User> result =
                this.webTestClient.get().uri("/api/users")
                        .accept(MediaType.APPLICATION_JSON)
                        .exchange()
                        .returnResult(User.class);

        List<User> users = result.getResponseBody()
                .collectList()
                .block();
        Assert.assertEquals("User size is not matched", 3, users.size());
    }

    @Test
    public void shouldReturnSingleUser() {
        User user =
                webTestClient.get()
                        .uri("/api/user/1")
                        .accept(MediaType.APPLICATION_JSON)
                        .exchange()
                        .returnResult(User.class)
                        .getResponseBody().blockFirst();
        assert user.getId() == 1;
        assert user.getUser().equals("Bibek Shakya");
    }

   
}
