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

    public Object setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("names cannot be null");
        } else {
            this.firstName = firstName;
        }
        return null;
    }

    public String getLastName() {
        return lastName;
    }

        public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        public void setGpa(double gpa) {
            if (gpa < 0.0 || gpa > 4.0) {
                throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
            } else {
                this.gpa = gpa;
            }
        }

        public Student (String firstName, String lastName, int id, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.gpa = gpa;
        }

        public Student() {
        this.firstName = null;
        this.firstName = null;
        this.id = 0;
        }

        public String toString() {
        return String.format("%s, %s (ID = %d); %.2f", this.lastName, this.firstName, this.id, this.gpa);
        }
}
