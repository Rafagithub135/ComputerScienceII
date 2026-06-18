package HackLabs.Lab1;

public class TwelveHourClock extends Clock{
    private boolean isAM;

    public TwelveHourClock() {
        isAM = true;
    }

    public void reset() {
        setHours(12);
        setMinutes(0);
        setSeconds(0);
        isAM = true;
    }

    public void forward(int seconds) {
        int curSec = getSeconds();
        curSec += seconds;
        setSeconds(curSec);
    }

    public void reverse(int seconds) {
        int curSec = getSeconds();
        curSec -= seconds;
    }

    public int getTime() {
        return super.getTime();
    }


}
