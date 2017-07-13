package io.github.bibekshakya35.jpahibernate.user.shared;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bibek on 7/12/17.
 */
public interface UserDao extends JpaRepository<User, Long> {
}
