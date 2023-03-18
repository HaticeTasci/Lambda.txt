package string;

public class String03 {
    public static void main(String[] args) {

      String str ="ahmet furkan  ";

      int sonKarakter=str.trim().length()-1;
     String boslukOlmayan=str.substring(sonKarakter,sonKarakter+1);
        System.out.println(boslukOlmayan);

    }
}
