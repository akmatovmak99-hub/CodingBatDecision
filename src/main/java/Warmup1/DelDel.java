package Warmup1;

public class DelDel {
    public static void main(String[] args) {
        DelDel a = new DelDel();
        System.out.println(a.delDel("deludes"));
    }
    public String delDel(String str) {
        if(str.length()<4)return str;
        String del = str.substring(1, str.length());
        if (del.startsWith("del")) return str.charAt(0) + str.substring(4, str.length());
        return str;
    }

}
