package Lab3;

import java.io.File;

public class FileTest {
    public FileTest(String lookupTerm) {
    }

    public static void main(String[] args) {
        File theFile = new File(args[0]);
        System.out.println(theFile.getName());
        System.out.println(theFile.getAbsolutePath());
    }
}