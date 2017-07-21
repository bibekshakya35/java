package io.github.bibekshakya35.jpahibernate.post.uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bibek on 7/14/17.
 */
@Repository
public interface PostCommentDao extends JpaRepository<PostComment, Long> {
}
