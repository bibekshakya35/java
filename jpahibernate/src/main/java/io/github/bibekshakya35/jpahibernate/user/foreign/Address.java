package io.github.bibekshakya35.jpahibernate.user.foreign;

import javax.persistence.*;

/**
 * Created by bibek on 7/12/17.
 */
//@Entity
//@Table(name = "ADDRESS_2")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@OneToOne

}
