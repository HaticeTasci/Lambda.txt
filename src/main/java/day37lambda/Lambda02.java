package day37lambda;

import day36lambda.Utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        //1)LambdaTextFlie dosyasi icindeki metni konsola yazdiran kodu yazimiz.

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);


        Files.
                lines(Paths.
                        get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);
        //3)dosyasi icinde gerhangi bir kelimenin varolup olmadigini gosteren kodu yaziniz.
        boolean nresult= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).

                map(t->t.split(" ")).flatMap(Arrays::stream).anyMatch(t->t.contains("Java"));
        System.out.println(nresult);

        //4)dosyasi icindeki her kelimenin "a icerip icermedigini kontroleden kodu yaziniz

        boolean nresult1= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).anyMatch(t->t.contains("a"));
        System.out.println(nresult1);
        //5)icindeki hicbir kelimenin "x icermedigini gosteren kodu yaziniz
        boolean nresult2= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).noneMatch(t->t.contains("x"));
        System.out.println(nresult2);
        //6)"r" ile biten kelimeri sayan kodu yaziniz.
        int result3= (int) Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();
        System.out.println(result3);








    }

}
