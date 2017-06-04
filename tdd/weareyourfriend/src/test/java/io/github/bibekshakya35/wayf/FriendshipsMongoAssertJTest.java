package io.github.bibekshakya35.wayf;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.*;

/**
 *
 * @author bibek
 */
@RunWith(MockitoJUnitRunner.class)
public class FriendshipsMongoAssertJTest {

    private static final Logger LOG = Logger.getLogger(FriendshipsMongoAssertJTest.class.getName());

    @InjectMocks
    FriendshipsMongo friendshipsMongo;

    @Mock
    FriendsCollection friendsCollection;

    @Test
    public void mockingWorkAsExpected() {
        Person bibek = new Person("bibek");
        doReturn(bibek)
                .when(friendsCollection)
                .findByName("bibek");
        assertThat(friendsCollection.findByName("bibek")).isEqualTo(bibek);
    }

    @Test
    public void alexDoesnotHaveFriends() {
//        Person bibek = new Person("bibek");
//        doReturn(bibek)
//                .when(friendsCollection)
//                .findByName("bibek");
//        assertThat(friendsCollection.findByName("bibek").getFriends())
//                .hasSize(5);
    }

    @Test
    public void bHas5friends() {
        List<String> expected = Arrays.asList(new String[]{"dipesh", "buddha", "niha", "neha", "suja"});

        Person bibek = spy(new Person("bibek"));
        doReturn(bibek).when(friendsCollection).findByName("bibek");
        doReturn(expected).when(bibek)
                .getFriends();
        LOG.log(Level.INFO, "is we there{0}", Arrays.toString(friendshipsMongo.getFriendsList("bibek").toArray()));
        assertThat(
                friendsCollection.findByName("bibek").getFriends()
        ).hasSize(5)
                .containsOnly("dipesh", "buddha", "niha", "neha", "suja");
    }

    @Test
    public void whenCreateMock_thenCreated() {
        List mockedList = mock(ArrayList.class);
        mockedList.add("one");
        verify(mockedList).add("one");
        assertThat(mockedList).hasSize(0);
    }

    @Test
    public void whenCreateSpy_thenCreate() {
        List mockedList = spy(ArrayList.class);
        mockedList.add("ONE");
        verify(mockedList).add("ONE");
        assertThat(mockedList).hasSize(1);
    }
}
