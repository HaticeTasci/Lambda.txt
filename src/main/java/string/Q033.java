package string;

public class Q033 {
    public static void main(String[] args) {

       //Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters




        String cityName = " mIAMI ";
        String upDate=cityName.trim().toLowerCase();
        upDate=upDate.substring(0,1).toUpperCase()+upDate.substring(1);
        System.out.println(upDate);

    }
}
