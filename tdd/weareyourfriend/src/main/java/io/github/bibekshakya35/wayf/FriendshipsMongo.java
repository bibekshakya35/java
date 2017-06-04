package io.github.bibekshakya35.wayf;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriendshipsMongo {

    private final FriendsCollection friendsCollection;
    
    private static final Logger LOG = Logger.getLogger(FriendshipsMongo.class.getName());
    
    public FriendshipsMongo() {
        friendsCollection = new FriendsCollection();
    }
    
    public List<String> getFriendsList(String person) {
        Person p = friendsCollection.findByName(person);
        LOG.log(Level.INFO, "is there any one out there{0}", p == null);
        if (p == null) {
            return Collections.emptyList();
        }
        
        return p.getFriends();
    }
    
    public void makeFriends(String person1, String person2) {
        addFriend(person1, person2);
        addFriend(person2, person1);
    }
    
    public boolean areFriends(String person1, String person2) {
        Person p = friendsCollection.findByName(person1);
        return p != null && p.getFriends().contains(person2);
    }
    
    private void addFriend(String person, String friend) {
        Person p = friendsCollection.findByName(person);
        if (p == null) {
            p = new Person(person);
        }
        p.addFriend(friend);
        friendsCollection.save(p);
    }
}
