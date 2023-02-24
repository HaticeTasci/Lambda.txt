package day23Map;

import java.util.TreeMap;

public class Map05 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(103, "Tom");
        tm.put(104, "Hanks");
        tm.put(null, "Brad");
        tm.put(102, null);
        System.out.println(tm);
        // prints {null=Brad, 102=null, 103=Tom, 104=Hanks}

    }
}
