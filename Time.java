public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public static void main(String[] args) {
        Time time = new Time();
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time time = new Time(11, 59, 59.9);

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }


    public static void printTime(Time t) {
        System.out.print(t.hour);
        System.out.print(":");
        System.out.print(t.minute);
        System.out.print(":");
        System.out.println(t.second);
    }

    public static void printTime1(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
    }

    public String toString() {
        return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }
}