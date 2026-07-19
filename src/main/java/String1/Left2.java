package String1;

public class Left2 {
    public static void main(String[] args) {
        Left2 a =new Left2();
        System.out.println(a.left2("Hello"));
    }
    public String left2(String str) {
        if(str.length()<2){
            return str;
        }else {
            String first = str.substring(0,2);
            return str.substring(2)+first;
        }
    }

}
