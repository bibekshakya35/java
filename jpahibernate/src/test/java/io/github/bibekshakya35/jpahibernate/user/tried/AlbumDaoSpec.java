package io.github.bibekshakya35.jpahibernate.user.tried;

import io.github.bibekshakya35.jpahibernate.JpahibernateApplication;
import io.github.bibekshakya35.jpahibernate.user.onetomany.Phone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by bibek on 7/13/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpahibernateApplication.class})
public class AlbumDaoSpec {
    private static final Logger LOG = Logger.getLogger(AlbumDaoSpec.class.getName());
    @Autowired
    private AlbumDao albumDao;
    @Autowired
    private PhotoDao photoDao;

    @Test
    public void shouldSave() {
        Album myAlbum = new Album();
        myAlbum.setAlbumName("Bibek");
        Photo photo1 = new Photo();
        photo1.setAlbum(myAlbum);
        Photo photo2 = new Photo();
        photo2.setAlbum(myAlbum);
        photo1.setName("Bibek1");
        photo2.setName("Bibek 2");
        Set<Photo> photos = new HashSet<>();
        photos.add(photo1);
        photos.add(photo2);
        myAlbum.setPhotos(photos);
        Album album = albumDao.save(myAlbum);
        LOG.info(album.toString());
        assert album.getId() == 1L;
        assert album.getPhotos().contains(photo1);
    }

    @Test
    public void shouldSavePhoto() {
        Photo photo1 = new Photo();
        photo1.setName("Bibek1");
        Photo persistPhoto = photoDao.save(photo1);
        assert persistPhoto.getId() == 1L;
    }
}
