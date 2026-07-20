package String1;

public class WithouEnd2 {
    public static void main(String[] args) {
        WithouEnd2 a = new WithouEnd2();
        System.out.println(a.withouEnd2("Hello"));
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        else return str.substring(1, str.length() - 1);
    }

}
