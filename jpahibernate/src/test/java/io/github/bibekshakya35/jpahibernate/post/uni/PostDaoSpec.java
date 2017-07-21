package io.github.bibekshakya35.jpahibernate.post.uni;

import io.github.bibekshakya35.jpahibernate.JpahibernateApplication;
import io.github.bibekshakya35.jpahibernate.TestPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bibek on 7/14/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpahibernateApplication.class})
public class PostDaoSpec {
    @Autowired
    private PostDao postDao;

    @Test
    public void shouldAddPostWithThreePost() {
        Post post = new Post("First Post");
        post.getPostComments().add(
                new PostComment("My First Review")
        );
        post.getPostComments().add(
                new PostComment("My second review")
        );
        post.getPostComments().add(
                new PostComment("My third review")
        );
        Post persistPost = this.postDao.save(post);
        assert persistPost.getPostComments().get(0).getReview().equals("My First Review");
    }
}
