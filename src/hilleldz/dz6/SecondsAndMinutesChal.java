package hilleldz.dz6;

public class SecondsAndMinutesChal {
    final static int MIN_IN_HOUR = 60;
    final static int SEC_IN_MIN = 60;

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3766));

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / MIN_IN_HOUR;
        minutes = minutes - (hours * MIN_IN_HOUR);
        String hms = String.format("%02dh ", hours) + String.format("%02dm ", minutes) + String.format("%02ds", seconds);
        return hms;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int min = seconds / SEC_IN_MIN;
        seconds = seconds - (min * SEC_IN_MIN);
        return getDurationString(min, seconds);
    }
}
