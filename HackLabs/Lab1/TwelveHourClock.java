package HackLabs.Lab1;

public class TwelveHourClock extends Clock {
    private static boolean isAM;

    public TwelveHourClock() {
        isAM = true;
    }

    public static void reset() {
        setHours(12);
        setMinutes(0);
        setSeconds(0);
        isAM = true;
    }

    public static int forward(int seconds) {
        int curSec = getSeconds();
        curSec += seconds;
        setSeconds(curSec);

        if (curSec < 0) {
            System.out.println("Cannot add negative seconds!  Try again!");
        } else if (curSec > 60) {
            setMinutes(getMinutes() + curSec / 60);
            setSeconds(curSec % 60);
        } else {
            setSeconds(curSec);
        }
        return getTime();
    }

    public static int reverse(int seconds) {
        int curSec = getSeconds();
        curSec -= seconds;

        if (curSec < 0) {
            System.out.println("Cannot remove negative seconds!  Try again!");
        } else if (curSec > 60) {
            setMinutes(getMinutes() - curSec / 60);
            setSeconds(60 - curSec % 60);
        } else {
            setSeconds(curSec);
        }
        return getTime();
    }

    public static int getTime() {
        return Clock.getTime();
    }

    static void main() {
        forward(23);
    }
}