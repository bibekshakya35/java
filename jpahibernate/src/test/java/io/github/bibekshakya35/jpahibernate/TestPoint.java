package io.github.bibekshakya35.jpahibernate;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.*;

/**
 * Created by bibek on 7/14/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpahibernateApplication.class})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestPoint {
}
