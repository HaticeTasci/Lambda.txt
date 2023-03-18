package string;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {

        String str="Ali";
        String str1="ayse";
        System.out.println(str.equalsIgnoreCase(str1));

//2:
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir  e mail adresinizi giriniz");
         String email= input.next();
if (!email.contains("@gmail.com")){
    System.out.println("Lutfen bir  e mail adresinizi giriniz");
    
} else if (email.endsWith("@gmail.com")) {
    System.out.println("@mail adresiniz kaydedildi");

}else
    System.out.println("lutfen yazinizi kontrol ediniz");
     // 3:

        String kucukHarf="Dunya buyuk, insanlar kucuk";


        if (kucukHarf.contains("büyük")){

            System.out.println(kucukHarf.toUpperCase());
        }else if (kucukHarf.contains("kucuk")){
            System.out.println(kucukHarf.toLowerCase());
        }else if (!(kucukHarf.contains("buyuk"))&&kucukHarf.contains("kucuk")){
            System.out.println("cumle kucuk yada buyuk harf icermiyor");
        }else System.out.println("kaar ver buyuk mu yazdirayim kucuk mu");



        }

    }


