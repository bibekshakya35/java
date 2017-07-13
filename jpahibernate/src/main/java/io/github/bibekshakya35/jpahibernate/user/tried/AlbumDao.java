package io.github.bibekshakya35.jpahibernate.user.tried;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bibek on 7/13/17.
 */
@Repository
public interface AlbumDao extends JpaRepository<Album, Long> {
}
