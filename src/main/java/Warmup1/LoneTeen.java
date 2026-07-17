package Warmup1;

public class LoneTeen {
    public static void main(String[] args) {
        LoneTeen a =new LoneTeen();
        System.out.println(a.loneTeen(10,13));
    }
    public boolean loneTeen(int a, int b) {
        return (a!=b)&&((a<13||a>19)||(b<13||b>19));
    }

}
