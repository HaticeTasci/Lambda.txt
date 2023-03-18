package string;

import java.util.Arrays;

public class Calisma {
    public static void main(String[] args) {
        String input = "Ali\n" +
                "Veli Han\n" +
                "Kemal Can Kuzu";
        String rev = "";
        String[] lines = input.split(System.getProperty("line.separator"));
        for (String w : lines) {
            String[] words = w.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                if (i != 0) {
                    rev = rev + words[i] + " ";
                } else {
                    rev = rev + words[i];
                }
            }
            System.out.println(rev);
            rev = "";
        }
    }
}