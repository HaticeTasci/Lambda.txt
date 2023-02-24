package set;

import java.util.ArrayList;
import java.util.List;

public class Set01 {
    public static void main(String[] args) {
     //   Find the sum of all list elements in an integer list
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum = 0;
        for(Integer w : myList){
            sum = sum + w; }
        System.out.println(sum);//73



    }

}
