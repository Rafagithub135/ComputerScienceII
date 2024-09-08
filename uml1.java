import java.util.Scanner;


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


    }
