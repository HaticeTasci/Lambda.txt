package string;

public class String02 {

    public static void main(String[] args) {

        String isim1="ahmet furkan";
        String isim2="ömer faruk";
        String isim3="ayse nur";

        int a1=isim1.replaceAll("\\s"," ").length();
        int a2=isim2.replaceAll("\\s"," ").length();
        int a3=isim3.replaceAll("\\s"," ").length();
        System.out.println("toplam bosluksuz karakter saiyi : "+ (a3+a1+a2));
    }
}
