package io.github.bibekshakya35.wayf;

import org.easymock.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.easymock.EasyMock.*;

/**
 *
 * @author bibek
 */
@RunWith(EasyMockRunner.class)
public class FriendshipsMongoEasyMockTest {

    private static final Logger LOG = Logger.getLogger(FriendshipsMongoEasyMockTest.class.getName());

    @TestSubject
    FriendshipsMongo friendshipsMongo = new FriendshipsMongo();

    @Mock(type = MockType.NICE)
    FriendsCollection friendsCollection;

    @Test
    public void mockingWorkFine() {
        Person bibek = new Person("bibek");
        expect(friendsCollection.findByName("bibek")).andReturn(bibek);
        replay(friendsCollection);
        assertThat(friendsCollection.findByName("bibek"))
                .isEqualTo(bibek);
    }

    @Test
    public void alexDoesnotHaveFriends() {
        assertThat(friendshipsMongo.getFriendsList("alex")).isEmpty();
    }

    @Test
    public void bibekHasFivefriend() {
        List<String> expected = Arrays.asList(new String[]{
            "dipesh", "buddha", "niha", "neha", "suja"
        });
        Person bibek = createMock(Person.class);
        expect(friendsCollection.findByName("bibek")).andReturn(bibek);
        expect(bibek.getFriends()).andReturn(expected);
        replay(friendsCollection);
//        assertThat(
//                friendshipsMongo.getFriendsList("bibek")
//        )
//                .hasSize(5)
//                .containsOnly("dipesh", "buddha", "niha", "neha", "suja");
        LOG.log(Level.INFO, "----data----{0}", Arrays.toString(friendshipsMongo.getFriendsList("bibek").toArray()));
    }
}
