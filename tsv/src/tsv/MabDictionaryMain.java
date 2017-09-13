package tsv;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bibek on 8/20/17.
 */
public class MabDictionaryMain {
    public static void main(String[] args) throws Exception{
        List<Visitors> beans = new CsvToBeanBuilder(new FileReader("/home/bibek/Desktop/mAb_temp_Dictionary_ahrqlatest.tab"))
                .withSeparator('\t')
                .withType(Visitors.class).build().parse();
        System.out.println(Arrays.toString(beans.toArray()));
    }
}
