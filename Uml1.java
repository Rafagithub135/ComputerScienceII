import java.util.Scanner;

// TODO:  Create a name for each section.
// TODO:  Create a section number.
// TODO:  Create a registration number.
// TODO:  Create a description.
// TODO:  Create a doy of the week the class will meet.
// TODO:  Create a start time for the class.  Use a 24 hour clock.
// TODO:  Create a section to control the number of students enrolled.  The count will start at 0 and the maximum will be 20.
// TODO:  Track student ID numbers of the enrolled students.
// TODO:  Write a program that uses the class to create 5 course section instances that will create 5 class section objects, each with a different student ID.
// TODO:  Create a program that mimics a public course registration terminal.
// TODO:  When the program starts, it should ask the user to enter their student ID and capture the number.  Once the student ID is captured, display a list of all course sections including the course number, section number, and number of available seats.  Allow the student to enter course registration numbers.  Each time they do, update the course section object as needed.  When the student is done, return to the prompt to allow another student to enter their student ID.
// TODO:  Create a way to cleanly exit the program and return to the student ID screen when a student is finished.

// TODO:  DO NOT IMPORT ANYTHING EXCEPT THE SCANNER CLASS.
// TODO:  USE ONLY SIMPLE ARRAYS.
// TODO:  A STUDENT SHOULD NOT BE ABLE TO ENROLL IN THE SAME SECTION TWICE.  PREVENT THIS AND PROVIDE USEFUL FEEDBACK TO THE STUDENT.
// TODO:  IN A REAL PROGRAM, THE DATA WOULD PERSIST.  IF YOU CLOSED THE PROGRAM AND STARTED IT UP AGIAN LATER, THE RECORDS FROM THE LAST SESSION WOULD CONTINUE TO EXIST.  YOUR PROGRAM WILL NOT DO THIS.  EVERY TIME YOU START IT, ALL SECTIONS WILL BE ERASED AND HAVE 20 AVAILABLE SEATS.  THIS IS EXPECTED AND FINE.
// TODO:  ZIP YOUR ENTIRE PROJECT FOLDER INCLUDING ALL CLASSES TOGETHER FOR SUBMISSION.
public class Uml1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        String employeeID;
        String lastName;
        String firstName;
        double rate;
        double hours;
        Boolean certified;

        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }

    public static String[] adjectives = {"big", "small", "tall", "short", "long", "round", "square", "fat", "skinny", "slim"};

        public static String[] nouns = {"table", "chair", "desk", "lamp", "book", "pen", "pencil", "cup", "bottle", "computer"};

        public static String randomElement(String[] array ){
            int random = (int) (Math.random() * array.length);
            return array[random];
        }

        public static String[] classNames = {"CSCI 111", "ENG 101", "CIS 200", "MATH 161", "MATH 162", "CSCI 112", "ENG 102", "ENG 115", "HIST 121", "SPAN 101"};


    }
