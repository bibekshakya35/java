package io.github.bibekshakya35.jpahibernate.user.shared;


import javax.persistence.*;

/**
 * Created by bibek on 7/12/17.
 * this is example from the book Java persistence with hibernate
 */
@Entity
@Table(name = "ADDRESSES")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    protected String street;
    protected String zipcode;
    protected String city;

    public Address(String street, String zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
