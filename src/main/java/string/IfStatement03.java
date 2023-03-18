package string;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bbir gun ismi giriniz");
        String gunIsmi=input.next().toLowerCase();

       if (gunIsmi.equals("pazar")|| gunIsmi.equals("cumartesi")){
           System.out.println("haftasonu");
       }else {
           System.out.println("Haftaici");
       }

            }
        }



