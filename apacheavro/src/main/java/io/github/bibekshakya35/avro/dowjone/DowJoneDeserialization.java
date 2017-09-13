package io.github.bibekshakya35.avro.dowjone;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by bibek on 8/7/17.
 */
public class DowJoneDeserialization {
    private static final Logger LOGGER = Logger
            .getLogger(DowJoneDeserialization.class.getName());
    private static final String AVRO_DIRECTORY = "/home/bibek/avro/test";
    private DatumReader<GenericRecord> datumReader;
    private final String SCHEMA_PATH = "/schema/dna.avsc";

    public DowJoneDeserialization() {
        try {
            final Schema schema = new Schema.Parser()
                    .parse(new File(DowJoneDeserialization.class.getResource(SCHEMA_PATH).toURI()));
            datumReader = new GenericDatumReader<>(schema);
        } catch (IOException | URISyntaxException ex) {
            LOGGER.log(Level.ERROR,ex.getMessage());
        }
    }

    /*
        * Method will list all the file from given directory
        * @param directory A directory where file involve
        * @return List<File> list of file
        * @throws IOException
        * @since 1.8
        */
    private List<File> getFiles(String directory) {
        List<File> files = Collections.emptyList();
        try (Stream<Path> filePath$ = Files.walk(Paths.get(directory))) {
            files = filePath$.filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException io) {
            LOGGER.log(Level.ERROR,io.getMessage());
        }
        return files;
    }

    private Collection<File> getFilesFromDirectory(String directory) {
        final String[] SUFFIX = {"avro"};
        return FileUtils.listFiles(new File(directory),
                SUFFIX,
                true
        );
    }

    private static Date conversion(Object object) {
        if (object instanceof Date) {
            return (Date) object;
        } else {
            return new Date((Long) object);
        }
    }

    /**
     * Method will mutate list of DowJoneCollection by iterating files from given directory
     *
     * @return List<DowJoneCollection> list of DowJoneCollection
     **/
    public List<DowJoneCollection> produce() {
        List<DowJoneCollection> dowJoneCollections = new ArrayList<>();
        List<File> fileSets
                = (List<File>) this.getFilesFromDirectory(AVRO_DIRECTORY);
        for (File file : fileSets) {
            this.doThing(dowJoneCollections, file);
        }
        return dowJoneCollections;
    }

    /**
     * Method will mutate list of DowJoneCollection by iterating files from given directory
     *
     * @return List<DowJoneCollection> list of DowJoneCollection
     * @since 1.8
     */
    public List<DowJoneCollection> produce$() {
        List<DowJoneCollection> dowJoneCollections = new ArrayList<>();
        List<File> fileSets
                = this.getFiles(AVRO_DIRECTORY);
        fileSets.stream().forEach(file -> {
            this.doThing(dowJoneCollections, file);
        });
        return dowJoneCollections;
    }

    private void doThing(List<DowJoneCollection> dowJoneCollections, File file) {
        DataFileReader<GenericRecord> dataFileReader = null;
        try {
            dataFileReader = new DataFileReader<>(file, datumReader);
            GenericRecord document = null;
            while (dataFileReader.hasNext()) {
                document = dataFileReader.next(document);
                Date publishedOn = conversion(document.get("publication_date"));
                DowJoneCollection dowJoneCollection
                        = new DowJoneCollection(
                        String.valueOf(document.get("an")),
                        String.valueOf(document.get("title")),
                        String.valueOf(document.get("body")),
                        publishedOn,
                        String.valueOf(document.get("byline")),
                        String.valueOf(document.get("publisher_name"))
                );
                dowJoneCollections.add(dowJoneCollection);
            }
        } catch (IOException io) {
            LOGGER.log(Level.ERROR,io.getMessage());
        } finally {
            try {
                dataFileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
