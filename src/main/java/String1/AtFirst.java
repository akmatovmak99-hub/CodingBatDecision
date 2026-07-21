package String1;

public class AtFirst {
    public static void main(String[] args) {
        AtFirst a = new AtFirst();
        System.out.println(a.atFirst("Hello"));
    }
    public String atFirst(String str) {
        if (str.length()>=2)return str.substring(0,2);
        else if(str.length()==1)return str+"@";
        else return "@@";
    }


}
