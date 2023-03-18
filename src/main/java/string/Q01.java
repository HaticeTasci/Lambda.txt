package string;

public class Q01 {
    public static void main(String[] args) {
        //Note: toUpperCase() method converts all characters in a String to uppercase Which ones are true?

        String str = "Hello World!";
        System.out.println(str.length() > str.charAt(6));
        //prints false on the console.

        String str1 = "Hello World!";
        System.out.println(str1.contains("E") != str1.equalsIgnoreCase("HELLO WORLD!"));
        //prints true on the console.

        String str3 = "Hello World!";
        System.out.println(str3.charAt(2) == str.charAt(9));
        System.out.println(str3.charAt(6));//
        //prints false on the console.

        String str4 = "Hello World!";
        System.out.println(str4.toUpperCase().charAt(0) == str4.charAt(0));
        //prints true on the console.
    }
}
