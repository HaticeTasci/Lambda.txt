package scanner_ssg;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String ad=input.next();

        System.out.println("Lutfen soy adinizi giriniz");
        String Soyad=input.next();

        System.out.println(ad+" "+ Soyad);


    }
}
