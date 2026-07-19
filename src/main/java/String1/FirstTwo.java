package String1;

public class FirstTwo {
    public static void main(String[] args) {
        FirstTwo a = new FirstTwo();
        System.out.println(a.firstTwo("Hello"));
    }
        public String firstTwo(String str) {
            if (str.length()<=2){
                return str;
            }else {
                return str.substring(0,2);
            }
        }
}
