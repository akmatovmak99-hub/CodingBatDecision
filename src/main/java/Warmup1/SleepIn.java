package Warmup1;

public class SleepIn {
    public static void main(String[] args) {
        SleepIn a = new SleepIn();
        a.sleepIn(true,false);

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) return true;
        return false;
    }
}
