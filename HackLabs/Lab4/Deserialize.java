package HackLabs.Lab4;

import java.io.*;

public class Deserialize {
    static void main() {
        City[] locale = new City[3];

        FileInputStream instream = null;
        ObjectInputStream objectInputFile = null;

        try {
            instream = new FileInputStream("C:\\CSCI\\CityObjects.dat");
            objectInputFile = new ObjectInputStream(instream);

            for(int i = 0; i < locale.length; i++) {
                locale[i] = (City)objectInputFile.readObject();
            }
        } catch(IOException e) {
            System.out.println("Problem reading from the file.");
        } catch(ClassNotFoundException e) {
            System.out.println("Incorrect Object Type.");
        }

        finally {
            try {
                objectInputFile.close();
            } catch(IOException e) {
            }
        }

        for(int i = 0; i < locale.length; i++) {
            System.out.println("City # " + (i + 1));
            System.out.println(" City Name:  " + locale[i].toString());
        }
    }
}