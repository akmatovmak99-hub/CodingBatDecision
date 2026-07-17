package Warmup1;

public class StartOz {
    public static void main(String[] args) {
        StartOz a = new StartOz();
        System.out.println(a.startOz("oziz"));
    }

    public String startOz(String str) {
        if (str.length() < 2) return str;
        char o = str.charAt(0);
        char z = str.charAt(1);
        if (o == 'o' && z == 'z') {
            return "oz";
        } else if (o == 'o') {
            return "o";
        } else if (z == 'z') {
            return "z";
        } else return "";
    }


}
