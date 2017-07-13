package io.github.bibekshakya35.jpahibernate.user.foreign;

import javax.persistence.*;

/**
 * Created by bibek on 7/12/17.
 */
//@Entity
//@Table(name = "USERS_f")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @OneToOne(
            mappedBy = "user",
            cascade = CascadeType.PERSIST
    )
    protected Address address;


}
