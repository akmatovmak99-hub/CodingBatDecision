package Warmup1;

public class HasTeen {
    public static void main(String[] args) {
        HasTeen a =new HasTeen();
        System.out.println(a.hasTeen(13,20,10));
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) ||  (c>=13 && c<=19);
    }

}
