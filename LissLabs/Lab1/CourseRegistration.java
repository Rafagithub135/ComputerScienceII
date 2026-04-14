package LissLabs.Lab1;

import java.util.*;

public class CourseRegistration {

    // Each class will be identified by a name (e.g., "Class 1") and hold up to 20 students
    private static final int MAX_STUDENTS_PER_CLASS = 30;
    private static final int TOTAL_CLASSES = 5;

    private Map<String, Set<String>> courseRegistrations;

    public CourseRegistration() {
        courseRegistrations = new HashMap<>();
        for (int i = 1; i <= TOTAL_CLASSES; i++) {
            courseRegistrations.put("Class " + i, new HashSet<>());
        }
    }

    // Register a student in a specific class
    public void registerStudent(String className, String studentNumber) {
        if (!courseRegistrations.containsKey(className)) {
            System.out.println("Class not found: " + className);
            return;
        }

        Set<String> students = courseRegistrations.get(className);

        if (students.contains(studentNumber)) {
            System.out.println("Student " + studentNumber + " is already registered in " + className + ".");
        } else if (students.size() >= MAX_STUDENTS_PER_CLASS) {
            System.out.println(className + " is full! Cannot register more than " + MAX_STUDENTS_PER_CLASS + " students.");
        } else {
            students.add(studentNumber);
            System.out.println("Student " + studentNumber + " registered successfully in " + className + ".");
        }
    }

    // Display current class lists
    public void showClassLists() {
        for (String className : courseRegistrations.keySet()) {
            System.out.println("\n" + className + " (" + courseRegistrations.get(className).size() + "/" + MAX_STUDENTS_PER_CLASS + " students):");
            for (String student : courseRegistrations.get(className)) {
                System.out.println(" - " + student);
            }
        }
    }

    // Main method for testing
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseRegistration system = new CourseRegistration();

        while (true) {
            System.out.println("\n--- CLASS REGISTRATION SYSTEM ---");
            System.out.println("1. Register a student");
            System.out.println("2. Show all class lists");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter class name (Class 1 - Class 5): ");
                    String className = scanner.nextLine();

                    System.out.print("Enter student number: ");
                    String studentNumber = scanner.nextLine();

                    system.registerStudent(className, studentNumber);
                    break;

                case 2:
                    system.showClassLists();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
