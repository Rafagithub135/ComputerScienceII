package Project2;

public class Course {
    private String courseNumber;
    private String courseName;
    private String department;
    private int credits;

    public Course (String cn, String name, String dept, int credits) {
        this.courseName = name;
        this.courseNumber = cn;
        this.department = dept;
        this.credits = credits;
    }

    public String toString() {
        return String.format("%s - %s - %d", this.courseNumber, this.courseName, this.credits);
    }


}
