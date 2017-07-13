package io.github.bibekshakya35.jpahibernate.user.onetomany;

import io.github.bibekshakya35.jpahibernate.JpahibernateApplication;
import io.github.bibekshakya35.jpahibernate.user.shared.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bibek on 7/13/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpahibernateApplication.class})
public class EmployeeDaoSpec {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private PhoneDao phoneDao;

    //unidirectional example
    @Test
    public void addEmployee() {
        Employee employee = new Employee();
        Phone phone = new Phone("9843598726", employee);
        Phone phone1 = new Phone("984787888", employee);
        Set<Phone> phones = new HashSet<>();
        phones.add(phone);
        phones.add(phone1);
        employee.setPhones(phones);
        this.employeeDao.save(employee);
    }

}
