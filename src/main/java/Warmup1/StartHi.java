package Warmup1;

public class StartHi {
    public static void main(String[] args) {
        StartHi a = new StartHi();
        System.out.println(a.startHi("Beka"));

    }

    public boolean startHi(String str) {
        return str.startsWith("Hi");
    }

}
