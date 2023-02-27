package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

       /*
   q1. create an array and sort the numbers in the array from smallest to largest.
 */
        int arr[]={9,8,5,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //
        String name[]={"Messi","C.Ronaldo","Pale","Ronaldinho"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

    }
}