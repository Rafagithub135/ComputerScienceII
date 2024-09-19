import java.util.Scanner;

// TODOne:  Create a name for each section.
// TODOne:  Create a section number.
// TODOne:  Create a registration number.
// TODOne:  Create a description.
// TODOne:  Create a doy of the week the class will meet.
// TODOne:  Create a start time for the class.  Use a 24 hour clock.
// TODOne:  Create a section to control the number of students enrolled.  The count will start at 0 and the maximum will be 20.
// TODOne:  Track student ID numbers of the enrolled students.
// TODO:  Write a program that uses the class to create 5 course section instances that will create 5 class section objects, each with a different student ID.
// TODO:  Create a program that mimics a public course registration terminal.
// TODOne:  When the program starts, it should ask the user to enter their student ID and capture the number.
// TODO:  Once the student ID is captured, display a list of all course sections including the course number, section number, and number of available seats.
// TODO:  Allow the student to enter course registration numbers.  Each time they do, update the course section object as needed.
// TODO:  When the student is done, return to the prompt to allow another student to enter their student ID.
// TODO:  Create a way to cleanly exit the program and return to the student ID screen when a student is finished.

// TODOne:  DO NOT IMPORT ANYTHING EXCEPT THE SCANNER CLASS.
// TODO:  USE ONLY SIMPLE ARRAYS.
// TODO:  A STUDENT SHOULD NOT BE ABLE TO ENROLL IN THE SAME SECTION TWICE.  PREVENT THIS AND PROVIDE USEFUL FEEDBACK TO THE STUDENT.
// TODO:  IN A REAL PROGRAM, THE DATA WOULD PERSIST.  IF YOU CLOSED THE PROGRAM AND STARTED IT UP AGAIN LATER, THE RECORDS FROM THE LAST SESSION WOULD CONTINUE TO EXIST.  YOUR PROGRAM WILL NOT DO THIS.  EVERY TIME YOU START IT, ALL SECTIONS WILL BE ERASED AND HAVE 20 AVAILABLE SEATS.  THIS IS EXPECTED AND FINE.
// TODO:  ZIP YOUR ENTIRE PROJECT FOLDER INCLUDING ALL CLASSES TOGETHER FOR SUBMISSION.


public class Uml1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the course registration terminal. Please enter your name:  ");
        String name = sc.nextLine();
        System.out.println("Please enter your student ID:  ");
        String studentID = sc.nextLine();
        System.out.println(studentID);
        System.out.println("Please enter the course number of the class you would like to register for:  ");
        int courseNumber = sc.nextInt();
        System.out.println(courseNumber);
    }
//
//    public class Course {
//        private String name;
//        private Section[] sections = new Section[5];
//
//        public Course(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Section[] getSections() {
//            return sections;
//        }
//
//        public void addSection(Section section) {
//            for (int i = 0; i < sections.length; i++) {
//                if (sections[i] == null) {
//                    sections[i] = section;
//                    break;
//                }
//            }
//        }
//
//        public String toString() {
//            return name;
//        }
//    }
//
//    public class Section {
//        private String name;
//        private int sectionNumber;
//        private int registrationNumber;
//        private String description;
//        private String dayOfWeek;
//        private int startTime;
//        private int maxStudents = 20;
//        private int studentCount = 0;
//        private int[] studentIDs = new int[maxStudents];
//
//        public Section(String name, int sectionNumber, int registrationNumber, String description, String dayOfWeek, int startTime) {
//            this.name = name;
//            this.sectionNumber = sectionNumber;
//            this.registrationNumber = registrationNumber;
//            this.description = description;
//            this.dayOfWeek = dayOfWeek;
//            this.startTime = startTime;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getSectionNumber() {
//            return sectionNumber;
//        }
//
//        public int getRegistrationNumber() {
//            return registrationNumber;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public String getDayOfWeek() {
//            return dayOfWeek;
//        }
//
//        public int getStartTime() {
//            return startTime;
//        }
//
//        public int getStudentCount() {
//            return studentCount;
//        }
//
//        public int getMaxStudents() {
//            return maxStudents;
//        }
//
//        public int[] getStudentIDs() {
//            return studentIDs;
//        }
//
//        public void addStudent(int studentID) {
//            if (studentCount < maxStudents) {
//                studentIDs[studentCount] = studentID;
//                studentCount++;
//            } else {
//                System.out.println("Section is full.");
//            }
//        }
//
//        public String toString() {
//            return name + " " + sectionNumber + " " + (maxStudents - studentCount);
//        }
//
//    }
//
//    public static String[] name = {"CSCI 111", "ENG 101", "CIS 200", "MATH 161", "MATH 162", "CSCI 112", "ENG 102", "ENG 115", "HIST 121", "SPAN 101"};
//    public static String[] DayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
}
