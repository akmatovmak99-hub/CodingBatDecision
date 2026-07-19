package String1;

public class FirstHalf {
    public static void main(String[] args) {
        FirstHalf a = new FirstHalf();
        System.out.println(a.firstHalf("WooHoo"));
    }
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
}
