package day23Map;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        //There is a Map which contains product names as key and number of the products as value. Type code to check if ‘Laptop’ is among the products.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        String expectedProduct = "Laptop";

        if (product.containsKey(expectedProduct)) {
            System.out.println(expectedProduct + " exists");
        } else {
            System.out.println(expectedProduct + " does not exist");
        }
        Map<String ,Integer> urun =new HashMap<>();
        urun.put("Kalem",12);
        urun.put("Defter",3);
        urun.put("Silgi",9);
        urun.put("Canta",5);
        String beklenenurun ="Kasik";

        if (urun.containsKey(beklenenurun)){

            System.out.print(urun + " var");
        }else {
            System.out.print(urun + "Yok");
        }
    }


}