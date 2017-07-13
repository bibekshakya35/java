package io.github.bibekshakya35.jpahibernate.user.tried;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bibek on 7/13/17.
 */
@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String albumName;
    @OneToMany(mappedBy = "album",
            cascade = CascadeType.ALL)
    private Set<Photo> photos = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

}
