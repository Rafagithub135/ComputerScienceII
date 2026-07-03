package HackLabs.Lab1;

public class Clock {
    private static int hours;
    private static int minutes;
    private static int seconds;

    public static int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public static int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static int getTime() {
        return hours  + minutes + seconds;
    }
}
