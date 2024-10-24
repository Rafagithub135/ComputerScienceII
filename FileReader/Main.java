package FileReader;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide input file.");
            System.exit(0);
        }

        String fileName = args[0];
        int data = -1;

        try {
            FileInputStream inputStream = new FileInputStream(fileName);

            do {
                data = inputStream.read();
                System.out.print(data + ", ");
            } while (data != -1);

            inputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//}
//    private Object data;
//    FileInputStream fis = new FileInputStream(String.valueOf(data));
//
//    public Main() throws FileNotFoundException {
//    }
}
