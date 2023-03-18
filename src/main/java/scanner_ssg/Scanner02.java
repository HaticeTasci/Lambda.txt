package scanner_ssg;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //
        Scanner input=new Scanner(System.in);

        System.out.println("uzunlugu giriniz");
        double length=input.nextDouble();

        System.out.println("Genisligi giriniz");
        double widrh=input.nextDouble();

        System.out.println("Yuksekligi giriniz");
        double height=input.nextDouble();

        System.out.println("Dikdortgen hacmi :" +length*widrh*height);
        System.out.println(DikdortgenHacmi(2,3,4));


    }
    public static double  DikdortgenHacmi(double length,double width, double height){

        return length*width*height;
    }
}
