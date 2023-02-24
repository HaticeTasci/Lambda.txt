package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set04 {
    public static void main(String[] args) {
        //Check if elements are in descending order in a list
        //Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        //(Yellow, Red, Green, Blue) ==> Output: It is in descending order


        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);

        int size = e.size();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i))) {
                flag++;
            }
        }
        if (flag == size) {
            System.out.println("It is in descending order");
        } else {
            System.out.println("It is not in descending order");
        }
    }
}
