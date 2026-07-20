package String1;

public class EndsLy {
    public static void main(String[] args) {
        EndsLy a = new EndsLy();
        System.out.println(a.endsLy("oddly"));
    }
    public boolean endsLy(String str) {
        if(str.length()<2) return false;
        String end = str.substring(str.length()-2);
        return end.contains("ly");
    }

}
