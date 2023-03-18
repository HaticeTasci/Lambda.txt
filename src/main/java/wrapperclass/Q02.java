package wrapperclass;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        //kullanicidan iki sayi isteyin aritmarik islemi gerceklestirin

        Scanner input =new Scanner(System.in);

        System.out.println("1.sayiyi giriniz");
        int sayi=input.nextInt();

        System.out.println("2.sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println(sayi+sayi1*3);
        System.out.println(sayi-sayi1);
        System.out.println(sayi*sayi1);
        System.out.println(sayi/sayi1);
        System.out.println(sayi%sayi1);



    }
}
