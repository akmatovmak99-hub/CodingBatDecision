package String1;

public class MakeOutWord {
    public static void main(String[] args) {
        MakeOutWord a = new MakeOutWord();
        System.out.println(a.makeOutWord("<<>>", "Yay"));
    }
    public String makeOutWord(String out, String word) {
        String first =out.substring(0,2);
        String last =out.substring(2,4);
        return first+word+last;
    }

}
