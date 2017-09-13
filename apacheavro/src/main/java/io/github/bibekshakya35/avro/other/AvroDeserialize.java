package io.github.bibekshakya35.avro.other;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;

import java.io.File;
import java.io.IOException;

/**
 * Created by bibek on 8/7/17.
 */
public class AvroDeserialize {
    public static void main(String[] args) throws IOException {
        Schema schema = new Schema.Parser().parse(new File("/home/bibek/bs-workspace/java/avro/target/classes/emp.avsc"));
        GenericRecord e1 = new GenericData.Record(schema);

        e1.put("name", "ramu");
        e1.put("id", 001);
        e1.put("salary", 30000);
        e1.put("age", 25);
        e1.put("address", "chenni");

        GenericRecord e2 = new GenericData.Record(schema);

        e2.put("name", "rahman");
        e2.put("id", 002);
        e2.put("salary", 35000);
        e2.put("age", 30);
        e2.put("address", "Delhi");

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);
        dataFileWriter.create(schema, new File("/home/bibek/bs-workspace/java/avro/target/classes/mydata.txt"));
        dataFileWriter.append(e1);
        dataFileWriter.append(e2);
        dataFileWriter.close();

        System.out.println("data successfully serialized");
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(new File("/home/bibek/bs-workspace/java/avro/target/classes/mydata.txt"), datumReader);
        GenericRecord emp = null;

        while (dataFileReader.hasNext()) {
            emp = dataFileReader.next(emp);

            System.out.println(emp.get("name"));
        }
        System.out.println("hello");

    }
}
