package string;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");

        int sayi = input.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("sayi cift ");
        }
        if (sayi % 2 != 0) {
            System.out.println("sayi tek");

        }
        if (sayi % 2 != 0) {
            System.out.println("sayi tek");


        } else{
            System.out.println("sayi cift");
        }
    }
}
