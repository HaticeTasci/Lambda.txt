package arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int arr[]={1,2,3};

        System.out.println(Arrays.toString(arr));
        //Example 1: Create an integer array  with 5 elements and print elements  console.
        int ages[] = new int[5];
        ages[0] = 13;
        ages[1] = 6;
        ages[2] = 19;
        ages[3] = -8;
        ages[4] = 10;
        System.out.println(Arrays.toString(ages));


        //Example 2: print elements these are less than or equal to  7 console.
        //1. Way:
        for(int w : ages){
            if(w<7){
                System.out.print(w + " ");//
            }
        }
        System.out.println();

        //2.Way:
        Arrays.sort(ages);

        for(int w : ages){
            if(w>=7){
                break;
            }else{
                System.out.print(w + " ");
            }
        }

    }
}