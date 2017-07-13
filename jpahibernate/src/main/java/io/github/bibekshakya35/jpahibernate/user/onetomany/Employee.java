package io.github.bibekshakya35.jpahibernate.user.onetomany;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by bibek on 7/13/17.
 */
@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "owner")
    private Set<Phone> phones;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }
}
