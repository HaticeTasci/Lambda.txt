package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));//60
        System.out.println(getSumFroMSeven());//2464
        System.out.println(getSumFroMSEigt());//181440
        System.out.println(getSumFroMSEigt1());//181440
        System.out.println(getFaktoriyel(5));//120
        System.out.println(getSumOfSayi(15, 4));//36
        System.out.println(getTamsayi(12, 18));//30


    }

    //1.soru
    public static int getSumOfAllElements(List<Integer> myList) {

        return myList.stream().reduce(Math::addExact).get();

    }

    //2.soru
    public static int getSumFroMSeven() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();

    }

    //3.soru
    public static int getSumFroMSEigt() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();

    }

    public static int getSumFroMSEigt1() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();

    }

    //4.size verien sayinin faktoriyelini hesaolayan kodu yaziniz

    public static int getFaktoriyel(int x) {
        if (x == 0) {
            return 1;

        } else if (x < 0) {
            System.out.println("faktoriyel negatif sayilarla yapilamaz");
            return -1;

        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();

        }

    }
    //5)size verlen iki tam sayi arasindaki cift sayilarin toplamini yaziniz

    public static int getSumOfSayi(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;//50

        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();

    }
    //6)2 TAM SASYI ARASINDAKI TUM SAYILARIN RAKAMLARI TOPLAMONI VEREN KODU YAZINIZ.

    public static int getTamsayi(int a, int b) {

       return IntStream.range(a + 1, b).map(Utils::getSamof).sum();


    }

}









