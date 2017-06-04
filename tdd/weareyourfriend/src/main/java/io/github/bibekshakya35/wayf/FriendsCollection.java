package io.github.bibekshakya35.wayf;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.net.UnknownHostException;

public class FriendsCollection {
    private MongoCollection mongoCollection;

    public FriendsCollection() {
        try {
            DB db = new MongoClient().getDB("friendships");
            mongoCollection = new Jongo(db).getCollection("friends");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Person findByName(String name) {
        return mongoCollection.findOne("{_id: #}", name).as(Person.class);
    }

    public void save(Person p) {
        mongoCollection.save(p);
    }
}
