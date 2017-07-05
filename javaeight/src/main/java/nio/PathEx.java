package nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by bibek on 7/4/17.
 */
public class PathEx {
    static final Logger LOG = Logger.getLogger(PathEx.class.getName());

    public static void main(String[] args) throws IOException {
        Path projects = Paths.get("/home/bibek", "software");
        System.out.println(projects.toAbsolutePath());
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());
        Path dot = Paths.get("/home/bibek/./software").normalize();
        System.out.println(dot.toAbsolutePath());
        Path changeDirectory = Paths.get("/home/bibek/../software").normalize();
        System.out.println(changeDirectory.toAbsolutePath());
        LOG.log(Level.INFO, "{0}", readFirstLineFromFileWithFinallyBlock());
        writeToFileZipFileContents("/home/bibek/apr.py.zip",
                "/home/bibek/b.py");
        //checkedExeception();
        uncheckedExecption();
    }

    static String readFirstLineFromFileWithFinallyBlock() throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("/home/bibek/intellij.py"));
        try {
            return bufferedReader.readLine();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
//    public static void checkedExeception(){
//        FileReader file = new FileReader("C:\\test\\a.txt");
//        BufferedReader fileInput = new BufferedReader(file);
//
//        // Print first 3 lines of file "C:\test\a.txt"
//        for (int counter = 0; counter < 3; counter++)
//            System.out.println(fileInput.readLine());
//
//        fileInput.close();
//    }
    public static void uncheckedExecption(){
        int x = 0;
        int y = 10;
        int z = y/x;
    }

    public static void writeToFileZipFileContents(String zipFileName,
                                                  String outputFileName)
            throws java.io.IOException {
        Charset charset = StandardCharsets.US_ASCII;
        Path outputFilePath = Paths.get(outputFileName);
        try (
                ZipFile zf =
                        new ZipFile(zipFileName);
                BufferedWriter bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
        ) {
                for (Enumeration entries = zf.entries();
                        entries.hasMoreElements();){
                    //get entry name and write it to the output file
                    String newLine =System.getProperty("line.separator");
                    String zipEntryName =
                            ((ZipEntry)entries.nextElement()).getName()+ newLine;
                    bufferedWriter.write(zipEntryName,0,zipEntryName.length());
                }
        }

    }
}
