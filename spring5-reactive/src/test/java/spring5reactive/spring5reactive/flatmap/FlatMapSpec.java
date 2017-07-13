package spring5reactive.spring5reactive.flatmap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bibek on 7/11/17.
 */
public class FlatMapSpec {
    private static final Logger LOG =
            Logger.getLogger(FlatMapSpec.class.getName());

    @Test
    public void convertStringToUpperCaseStreams() {
        List<String> collected =
                Stream.of("a", "b", "hello")
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        Assert.assertEquals(
                Arrays.asList("A", "B", "HELLO"),
                collected
        );
    }

    @Test
    public void shouldBeUniqueCharacterOnly() {
        List<String> lst =
                Arrays.asList("STACK", "OOOVER");
        //we provide input
        //[STACK, OOOVER]
        LOG.log(Level.INFO, "list is now {0}-{1}",
                new Object[]{
                        Arrays.toString(lst.toArray())
                });
        List<String[]> improvedLst = lst
                .stream()
                .map(w -> w.split(""))
                .distinct()
                .collect(Collectors.toList());
        LOG.log(Level.INFO, "list is now {0}-{1}",
                new Object[]{
                        Arrays.toString(improvedLst.get(0)),
                        Arrays.toString(improvedLst.get(1))
                });
    }

    @Test
    public void shouldBeUniqueCharacterOnl1y() {
        String[] arraysOfWord =
                {"STACK", "OOOVER"};
        Stream<String> streamOfWords =
                Arrays.stream(arraysOfWord);
        streamOfWords
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}
