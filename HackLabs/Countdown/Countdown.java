package HackLabs.Countdown;

import java.util.Date;

public class Countdown {
    static void main() {
        for (int i = 100; i > 0; i--) {
            time();
        }
    }

    public static void time() {
        try {
        Date t = new Date();
        System.out.println(t);
    } catch (Exception e) {
            System.out.println(e.getMessage());
    } finally {
            try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            }
        }
    }
}