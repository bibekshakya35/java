package io.github.bibekshakya35.jpahibernate.post.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by bibek on 7/14/17.
 */
@Entity
@Table(name = "post_comment")
public class PostComment {
    @Id
    @GeneratedValue
    private long id;
    
    private String review;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public PostComment(String review) {
        this.review = review;
    }
}
