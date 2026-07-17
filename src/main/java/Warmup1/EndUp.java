package Warmup1;

public class EndUp {
    public static void main(String[] args) {
        EndUp a =new EndUp();
        System.out.println(a.endUp("Hello"));
    }
    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        String last3 = str.substring(str.length() - 3, str.length()).toUpperCase();
        String start = str.substring(0, str.length() - 3);
        return start + last3;
    }

}
