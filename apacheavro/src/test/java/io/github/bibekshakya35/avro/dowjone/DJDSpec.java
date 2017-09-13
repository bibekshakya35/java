package io.github.bibekshakya35.avro.dowjone;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by bibek on 8/10/17.
 */
public class DJDSpec {
    @Test
    public void shouldReturnThirtyUsingCommonUtils(){
        List<DowJoneCollection> dowJoneCollections =
                new DowJoneDeserialization().produce();
        assert dowJoneCollections.size()==30;
        Assert
                .assertEquals(dowJoneCollections.size(),30);
    }
    @Test
    public void shouldReturnThirtyCollectionForJava8(){
        List<DowJoneCollection> dowJoneCollections =
                new DowJoneDeserialization().produce$();
        assert dowJoneCollections.size()==30;
        Assert
                .assertEquals(dowJoneCollections.size(),30);
    }

}
