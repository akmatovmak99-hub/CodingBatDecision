package Warmup1;

public class FrontBack {
    public static void main(String[] args) {
        FrontBack a = new FrontBack();
        System.out.println(a.frontBack("Bektur"));
    }

    public String frontBack(String str) {
        if(str.length()<=1)return str;
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length()-1);
        return lastLetter + str.substring(1, str.length() - 1) + firstLetter;
    }

}
