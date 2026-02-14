package Lab1;

import java.util.Scanner;

public class Lab1Section1 {
    public static void main(String[] args) {
        logIn();

    }

    public static void logIn() {
        System.out.println("Welcome, please enter your student ID (J-Number): ");
        Scanner scanner = new Scanner(System.in);
        String studentId = scanner.nextLine();
//        CourseRegistrationSystem crs = new CourseRegistrationSystem();
    }

    public class CourseSection {
        private String courseName;
        private int sectionNumber;
        private String registrationNumber;
        private String description;
        private String dayOfWeek;
        private String startTime;
        private int enrolledCount;
        private String[] enrolledStudents;
        private static final int MAX_ENROLLMENT = 20;

        public CourseSection(String courseName, int sectionNumber, String registrationNumber, String description, String dayOfWeek, String startTime) {
            this.courseName = courseName;
            this.sectionNumber = sectionNumber;
            this.registrationNumber = registrationNumber;
            this.description = description;
            this.dayOfWeek = dayOfWeek;
            this.startTime = startTime;
            this.enrolledCount = 0;
            this.enrolledStudents = new String[MAX_ENROLLMENT];
        }

        public boolean enrollStudent(String studentId) {
            if (enrolledCount < MAX_ENROLLMENT) {
                enrolledStudents[enrolledCount] = studentId;
                enrolledCount++;
                return true;
            } else {
                return false; // Section is full
            }
        }

        public int getAvailableSeats() {
            return MAX_ENROLLMENT - enrolledCount;
        }

        @Override
        public String toString() {
            return "Course: " + courseName + ", Section: " + sectionNumber + ", Reg#: " + registrationNumber +
                   ", Day: " + dayOfWeek + ", Time: " + startTime + ", Available Seats: " + getAvailableSeats();
        }
    }

    public class CourseRegistrationSystem {
        private CourseSection[] sections;

        public CourseRegistrationSystem() {
            sections = new CourseSection[5];
            sections[0] = new CourseSection("Intro to Programming", 1, "REG1001", "Learn the basics of programming.", "Monday", "10:00 AM");
            sections[1] = new CourseSection("Data Structures", 1, "REG1002", "Study of data organization.", "Wednesday", "1:00 PM");
            sections[2] = new CourseSection("Web Development", 1, "REG1003", "Building modern web applications.", "Friday", "3:00 PM");
            sections[3] = new CourseSection("Database Systems", 1, "REG1004", "Introduction to databases.", "Tuesday", "11:00 AM");
            sections[4] = new CourseSection("Operating Systems", 1, "REG1005", "Understanding OS concepts.", "Thursday", "2:00 PM");
        }

        public void displaySections() {
            for (CourseSection section : sections) {
                System.out.println(section);
            }
        }

        public boolean registerStudent(String studentId, String registrationNumber) {
            for (CourseSection section : sections) {
                if (section.registrationNumber.equals(registrationNumber)) {
                    return section.enrollStudent(studentId);
                }
            }
            return false; // Registration number not found
        }
    }
//    TODO:  Below you will find the UML diagram for a section of a college course.  Sections are individual date/time meetings for a course. A section has a name, section number, registration number, description, and day of the week that it meets (all sections will meet once a week), and a start time (all sections will be two (2) hours). Sections also have a count of students that are enrolled, and track the student ID numbers of the enrolled students. The number of enrolled students in our college will always start at zero (0) and sections will have a maximum enrollment of twenty (20).  Make a program that uses your class to create five (5) course section instances. Make up course names, meeting, days and times, section and registration numbers as well as course descriptions to create five (5) class section objects. Make sure they all have different registration id numbers. Create a program that mimics a public course registration terminal. When the program starts, it should ask the user to enter their student ID number (we use J-Numbers here at CCP so you can use that terminology). You don't have to validate the student ID number. Just capture any string they enter.  After a student ID number has been entered, show the student a list of all course sections along with the course number, section number and number of available seats. Allow the student to enter course registrations numbers. Each time they do, update the course section object as needed. When the student is done, return to the prompt to allow another student to enter a student ID number. Make sure to provide a way to cleanly exit the program and to return to the student id screen when a student no-longer wants to add classes.



}
