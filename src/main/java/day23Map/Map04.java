package day23Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class Map04 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hTable = new Hashtable<>();
        hTable.put(100, "Ali");
        hTable.put(101, "B");
        hTable.put(102, "Cem");
        hTable.replace(102, "Cem", "XXX");
        System.out.println(hTable);//{102=XXX, 101=B, 100=Ali}
        System.out.println(hTable.replace(104, "Y", "M"));//false

    }


}
