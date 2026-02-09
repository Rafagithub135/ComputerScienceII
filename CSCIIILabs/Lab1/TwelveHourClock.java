package CSCIIILabs.Lab1;

public class TwelveHourClock extends Clock {
    private boolean isAM() {
        return true;
    }

    public void reset() {

    }

    public void forward(int seconds) {

    }

    public void reverse(int seconds) {

    }

    public String getTime() {
        String amPm = isAM() ? "AM" : "PM";
        return "The current time is:  " + getTime() + amPm + ".";
    }
}