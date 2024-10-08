package Lab3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Lab3 {
    public static void main(String[] args) {
        Scanner searchTerm = new Scanner(System.in);
        System.out.println("Please enter the term to search for:  ");
        String lookupTerm = searchTerm.nextLine();
        System.out.println("Please enter the file to search:  ");
        String lookupLocation = searchTerm.nextLine();
        File inputFile = new File(lookupLocation);
//        try {
            Scanner fileReader = new Scanner(lookupTerm);
            while(fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
//        } catch (FileNotFoundException error) {
//            System.out.println("File could not be found.");
//        }
    }
}