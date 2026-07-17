package Warmup1;

public class ParrotTrouble {
    public static void main(String[] args) {
        ParrotTrouble a = new ParrotTrouble();
        System.out.println(a.parrotTrouble(false,12));
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) return true;
        return false;
    }
}
