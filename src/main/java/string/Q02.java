package string;


import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //Get a String and a character from user
        //Count the number of characters between the first occurrence and the last occurrence of the given character in the String
        //Do not count the space characters
        //If the character which user selected is displayed just once in the String return -1 If the character which user selected does not exist in the String return -1
        //For example; "Java is easy" - 'a' ==> 5
        //"Java is easy" - 'w' ==> -1 "Java is easy" - 'e' ==> -1

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a sitring");

        String s = scan.nextLine();

        System.out.println("karakter giriniz");

        char ch=scan.next().charAt(0);
        int first=s.indexOf(ch);
        int last=s.lastIndexOf(ch);
        int count=0;
        if (first==last){
            System.out.println(-1);
        }else {
            for (int i=first+1;i<last;i++){
                if (s.charAt(i)!=' '){
                    count++;
                }
            }
            System.out.println(count);
        }



    }

    }

