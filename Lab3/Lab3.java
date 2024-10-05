package Lab3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Lab3 {
    public static void main(String[] args) {
        File inputFile = new File("Lab3/data.txt");
        try {
            Scanner fileReader = new Scanner(inputFile);
            while(fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException error) {
            System.out.println("File could not be found.");
        }
    }
}