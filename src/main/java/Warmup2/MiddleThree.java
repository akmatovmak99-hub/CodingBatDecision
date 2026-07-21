package Warmup2;

public class MiddleThree {
    public static void main(String[] args) {
        MiddleThree a =new MiddleThree();
        System.out.println(a.middleThree("Candy"));
    }
    public String middleThree(String str) {
        return str.substring((str.length()/2)-1,(str.length()/2)+2);
    }

}
