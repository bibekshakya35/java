package io.github.bibekshakya35.jpahibernate.user.shared;

import io.github.bibekshakya35.jpahibernate.JpahibernateApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bibek on 7/12/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpahibernateApplication.class})
public class UserAddressSpec {
    @Autowired
    private UserDao userDao;
    @Autowired
    private AddressDao addressDao;
    private User user;
    private Address address;

    @Test
    public void shouldSharedAddress() {
        address =
                new Address("nepal", "123", "dsad");
        Address persistedAddress = this.addressDao.save(address);
        assert persistedAddress.getId() == 1L;
        user = new User(persistedAddress,
                "Bibek Shakya");
        user.setAddress(persistedAddress);
        User persistedUser = this.userDao.save(user);
        assert user.getId() == 1L;
    }

}
