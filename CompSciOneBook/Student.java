package CompSciOneBook;

public class Student {
    // member variables
    private String firstName;
    private String lastName;
    private int id;
    private double gpa;

//    Returns a formatted String of the Student's name as Last, First.
    public String getFormattedName() {
        return lastName + ", " + firstName;
    }

//    Scales the GPA, which is assumed to be on a 4.0 scale to a percentage.
    public double getGpaAsPercentage() {
        return gpa*.25;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
