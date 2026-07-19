package String1;

public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba a =new MakeAbba();
        System.out.println(a.makeAbba("Hello","Bye"));
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

}
