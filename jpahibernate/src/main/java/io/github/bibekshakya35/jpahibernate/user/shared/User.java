package io.github.bibekshakya35.jpahibernate.user.shared;

import javax.persistence.*;

/**
 * Created by bibek on 7/12/17.
 */
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @PrimaryKeyJoinColumn
    protected Address address;
    protected String username;

    protected User() {

    }

    public User(Address address, String username) {
        this.address = address;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
