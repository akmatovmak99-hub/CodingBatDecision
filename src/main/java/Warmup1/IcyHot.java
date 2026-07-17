package Warmup1;

public class IcyHot {
    public static void main(String[] args) {
        IcyHot a = new IcyHot();
        System.out.println(a.icyHot(120,-1));
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 || temp2 > 100) && (temp1 < 0 || temp2 < 0);
    }

}
