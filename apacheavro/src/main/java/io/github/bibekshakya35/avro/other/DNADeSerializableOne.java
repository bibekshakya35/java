package io.github.bibekshakya35.avro.other;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.FileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.JsonEncoder;
import org.apache.avro.mapred.FsInput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.net.URISyntaxException;
import org.apache.avro.file.SeekableByteArrayInput;
import org.apache.avro.file.SeekableInput;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by bibek on 8/7/17.
 */
public class DNADeSerializableOne {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        final GenericDatumReader<Object> reader = new GenericDatumReader<Object>();
        final Path path = new Path("/home/bibek/bs-workspace/uber/part-00018-of-00025.avro");
        FsInput fsInput = new FsInput(path, new Configuration());
        final FileReader<Object> fileReader = DataFileReader.openReader(fsInput, reader);
        try {
            final Schema schema = new Schema.Parser()
                    .parse(new File(DNADeSerializableOne.class.getResource("/schema/dna.avsc").toURI()));
            final DatumWriter<Object> writer = new GenericDatumWriter<Object>(schema);
            final JsonEncoder encoder = EncoderFactory.get().jsonEncoder(schema, os);
            for (final Object datum : fileReader) {
                writer.write(datum, encoder);
            }
            encoder.flush();
            String jsonString = new String(os.toByteArray());
            os.close();
        } finally {
            fileReader.close();
        }
       JSONObject jsonObject = convert(new FileInputStream("/home/bibek/bs-workspace/uber/part-00018-of-00025.avro"));
        System.out.println(jsonObject);
    }
    public static JSONObject convert (InputStream stream) throws IOException, JSONException {
        SeekableInput input = new SeekableByteArrayInput(IOUtils.toByteArray(stream));
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        // Conversion code taken from org.apache.avro.tool.DataFileReadTool
        GenericDatumReader<Object> reader = new GenericDatumReader<Object>();
        FileReader<Object> fileReader = DataFileReader.openReader(input, reader);
        try {
            Schema schema = fileReader.getSchema();
            DatumWriter<Object> writer = new GenericDatumWriter<Object>(schema);
            JsonEncoder encoder = EncoderFactory.get().jsonEncoder(schema, output);
            for (Object datum: fileReader) {
                encoder.configure(output);
                writer.write(datum, encoder);
                encoder.flush();
                // For some reason, we only contain one record, but the
                // decoding thinks we contain more and fails; so just break
                // after our first one.
                break;
            }
            output.flush();
        } finally {
            fileReader.close();
        }
        String jsonString = output.toString("UTF-8");
        System.out.println(jsonString);
        JSONObject json = new JSONObject(jsonString);

        // check meta data node of tile, typically it is serialized as a string
        // however this string will be valid JSON and can thus be parsed further
        JSONObject meta = json.optJSONObject("meta");
        if ( meta != null ) {
            JSONObject map = meta.optJSONObject("map");
            if ( map != null ) {
                String bins = map.optString("bins", null);
                System.out.print(bins);
                if ( bins != null ) {
                    map.put( "bins", new JSONArray( bins ) );
                }
            }
        }
        return json;
    }
}
