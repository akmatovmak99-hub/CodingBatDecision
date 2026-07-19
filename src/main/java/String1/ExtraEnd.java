package String1;

public class ExtraEnd {
    public static void main(String[] args) {
        ExtraEnd a =new ExtraEnd();
        System.out.println(a.extraEnd("Hello"));
    }
    public String extraEnd(String str) {
        if(str.length()<=2){
           return str+str+str;
        }else {
            String last = str.substring(str.length()-2);
            return last+last+last;
        }
    }

}
