package day36lambda;

public class Utils {

    public static int get(String s){
        return s.length()*s.length();
    }
    public static boolean isLengthEven(String s){
    return  s.length()%2==0;
    }
    public static String getLasChar(String s){
     return    s.substring(s.length()-1);
    }
    public static boolean isNumberEven(int x){
        return x%2==0;

    }
    public static int getSamof(int x){
        int sum =0;

        while (x!=0){
            sum = sum+x%10;
            x=x/10;


        }
        return sum;
    }
}
