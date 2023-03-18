package string;

public class IfStatement01 {
    public static void main(String[] args) {

        int a=30;
        int b=30;
        if (a==b){
            System.out.println("verilen sayi esittir");
            System.out.println("body icinde tum kodlar calisir");
        }
        if(a<100){
            System.out.println("a yuzden kucuk ");
        }
        if (a*b>5){
            System.out.println("sayilarin carpimi 5 ten buyuk");
        }

    }
}
