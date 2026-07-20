package String1;

public class MiddleTwo {
    public static void main(String[] args) {
        MiddleTwo a = new MiddleTwo();
        System.out.println(a.middleTwo("string"));
    }
    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

}
