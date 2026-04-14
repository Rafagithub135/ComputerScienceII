//package Lab4;
//
//import java.util.Arrays;
//
//public class Course {
//    private String courseNumber;
//    private int sectionNumber;
//    private int registrationNumber;
//    private String day;
//    private int startTime;
//    private String[] enrolledStudents;
//    private int enrolledCount;
//
//    public Course (String courseNumber, String name, String dept, int credits) {
//        this.courseNumber = courseNumber;
//        this.sectionNumber = sectionNumber;
//        this.registrationNumber = registrationNumber;
//        this.day = day;
//        this.startTime = startTime;
//        this.enrolledStudents = enrolledStudents;
//        this.enrolledCount = enrolledCount;
//    }
//
//    public String toString() {
//        return String.format("%s - %d - %d - %s - %d, %s - %d", this.courseNumber, this.sectionNumber, this.registrationNumber, this.day, this.startTime, Arrays.toString(this.enrolledStudents), this.enrolledCount);
//    }
//
//    public void ClassSection(String courseNumber, int sectionNumber, int registrationNumber, String day) {
//        this.courseNumber = courseNumber;
//        this.sectionNumber = sectionNumber;
//        this.registrationNumber = registrationNumber;
//        this.day = day;
//    }
//
//    public int getSectionNumber() {
//        return sectionNumber;
//    }
//
//    public int getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public String getDay() {
//        return day;
//    }
//    public int getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(int startTime) {
//        this.startTime = startTime;
//    }
//
//    public boolean addStudent() {
//        return true;
//    }
//
//    public int getEnrolledCount() {
//        return enrolledCount;
//    }
//
//    public int getSeatsRemaining() {
//        return 20 - enrolledCount;
//    }
//
//    public boolean getEnrolledStudents() {
//        return enrolledStudents.contains(registrationNumber);
//    }
//}
