package String1;

public class WithoutEnd {
    public static void main(String[] args) {
        WithoutEnd a =new WithoutEnd();
        System.out.println(a.withoutEnd("Hello"));
    }
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

}
