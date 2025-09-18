package Lab1;

import java.util.Scanner;

public class CourseSection {
    public static void main(String[] args) {
        classEnroll();
    }
    private String courseNumber;
    {

    }

    private int sectionNumber;
    {

    }

    private String registrationNumber;
    {

    }

    private String day;
    {

    }

    private int startTime;
    {

    }

    private String enrolledStudents[];
    {

    }
    public static void classEnroll() {

    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(String[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void ClassSection(String courseNumber, int sectionNumber, String registrationNumber, String day) {
        this.courseNumber = courseNumber;
        this.sectionNumber = sectionNumber;
        this.registrationNumber = registrationNumber;
        this.day = day;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getDay() {
        return day;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        startTime = startTime;
    }

    public boolean addStudent(String studentName) {
        return true;
    }

    public int getEnrolledNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return "CourseSection{" +
                "courseNumber='" + courseNumber + '\'' +
                ", sectionNumber=" + sectionNumber +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", day='" + day + '\'' +
                ", startTime=" + startTime +
//                ", enrolledStudents=" + Arrays.toString(enrolledStudents) +
                '}';
    }
}