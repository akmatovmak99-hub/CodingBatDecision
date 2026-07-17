package Warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        MonkeyTrouble a = new MonkeyTrouble();
        System.out.println(a.monkeyTrouble(true,false));
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) return true;
        return false;
    }
}
