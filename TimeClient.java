import java.sql.SQLOutput;

public class TimeClient {
    public static void main(String[] args) {
        Time time = new Time(10, 55, 20.5);
        System.out.println(time.getHour());
    }

}
