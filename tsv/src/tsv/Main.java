package tsv;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import com.univocity.parsers.tsv.TsvWriter;
import com.univocity.parsers.tsv.TsvWriterSettings;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class Main {
    private static Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        TsvParserSettings settings = new TsvParserSettings(); //you will find MANY options here

        TsvParser parser = new TsvParser(settings);

// parses all rows in one go.
        List<MabDictionary> mabDictionaries = new LinkedList<>();
        List<String[]> allRows = parser.parseAll(new FileReader("/home/bibek/Desktop/mAb_temp_Dictionary_ahrqlatest.tab"));
        LOG.info(Arrays.toString(allRows.get(0)));
        for (String[] rows : allRows) {
            mabDictionaries.add(new MabDictionary(
                    rows[0],
                    rows[1],
                    rows[2],
                    rows[3],
                    rows[4],
                    rows[5],
                    rows[6],
                    rows[7],
                    rows[8],
                    rows[9]
            ));
        }
        mabDictionaries.add(4,new MabDictionary(
               "abc",
                "11",
                "dasd",
                "dasd",
                "dasdasdad",
                "dasdasdf",
                "fgggg",
                "dfsdf",
                "fsdf",
                "dsfsf"
        ));
        Writer writer = new FileWriter("/home/bibek/Desktop/mAb_temp_Dictionary_ahrqlatest.tab",false);
        TsvWriter tsvWriter = new TsvWriter(writer,new TsvWriterSettings());
        tsvWriter.writeHeaders("Headword","ID","Term","Validate?","Disambiguation+","Disambiguation-","DateModified","Target","Disease","Company");
        List<Object[]> objects = new ArrayList<>();
        for (MabDictionary mabDictionary :mabDictionaries){
            objects.add(new Object[]{
                    mabDictionary.getEntityType(),
                    mabDictionary.getId(),
                    mabDictionary.getTerm(),
                    mabDictionary.getValidate(),
                    mabDictionary.getDisambiguationplus(),
                    mabDictionary.getDisambiguationminus(),
                    mabDictionary.getDateModified(),
                    mabDictionary.getTarget(),
                    mabDictionary.getDisease(),
                    mabDictionary.getCompany()
            });
        }
        tsvWriter.writeRowsAndClose(objects);
    }
}
