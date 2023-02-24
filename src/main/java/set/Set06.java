package set;

import java.util.ArrayList;
import java.util.List;

public class Set06 {
    public static void main(String[] args) {
        // If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        if (!h.contains(15) && !h.contains(13)) {
            System.out.println("The list does not contain 13 and 15");
        } else {
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i) == 15) {
                    int idx15 = h.indexOf(15);
                    h.remove(idx15);
                    i--;
                }
                if (h.get(i) == 13) {
                    int idx13 = h.indexOf(13);
                    h.remove(idx13);
                    i--;
                }
            }
            System.out.println(h);
        }
    }
        }