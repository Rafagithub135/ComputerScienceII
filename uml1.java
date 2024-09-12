import java.util.Scanner;

// TODO:  Create a name for each section.
// TODO:  Create a section number.
// TODO:  Create a registration number.
// TODO:  Create a description.
// TODO:  Create a doy of the week the class will meet.
// TODO:  Create a start time for the class.
// TODO:  Create a section to control the number of students enrolled.
// TODO:
public class uml1 {
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
