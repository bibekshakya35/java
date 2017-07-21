package io.github.bibekshakya35.jpahibernate.post.uni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bibek on 7/14/17.
 */
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<PostComment> postComments = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComment> postComments) {
        this.postComments = postComments;
    }

    public Post(String title) {
        this.title = title;
    }
}
