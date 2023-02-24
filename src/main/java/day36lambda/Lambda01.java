package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


/*
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);

        List<Double> half = getHalfElementGreaterThanFiveDisticReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]//buyukten kucuge ve tekrarsiz olarak verdi.
*/
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        // getHalfElementGreaterThanUpperDisticReversed(list);
       // System.out.println();
        lastHalfElementGreaterThanUpperDisticReversed(list);
        printSameLengAlfabetikOrder(list);
        System.out.println();
      //   System.out.println(removeElementIfThe(list));//Tom, Ajda, Tom, Brad]
        System.out.println();
       // System.out.println(removeElementIfStar(list));//[Tom, Tom, Cuneyt]
        System.out.println();
        System.out.println(PrintSquare(list));//[9, 16, 64, 9, 16, 36]burada ton karaktersayisinin karesini veriyor.
        System.out.println();
        System.out.println(printElement(list));//[Ajda, Angelina, Brad, Cuneyt]

    }

    //1)create a method to find the half of the elementsgreater than 5,distinc,in reverse order in a list.
    //public static List<Double> getHalfElementGreaterThanFiveDisticReversed(List<Double> myList) {
    //  return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());


    // }
//2)tum list elemanlarini kucuk harfla alfabetik siranin tersinde tekrarsiz olarak yaziniz.

    //public static List<Double> getHalfElementGreaterThanUpperDisticReversed(List<String> list) {

    //   list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.println(t + " "));

    public static List<Double> lastHalfElementGreaterThanUpperDisticReversed(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));//TOM CUNEYT BRAD ANGELİNA AJDA

        return null;
    }
    public static List<String> printSameLengAlfabetikOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
        return list;
    }

    //character sayisi 5 dne fazlaolan elemanlari isliniz.#
   // public static List<String> removeElementIfThe(List<String> list){


    //    list.removeIf(t->t.length()>5);

     //   return list;
    ////a ile baslayan ve b ile biten elemanlari isliniz

    public static List<String> removeElementIfStar(List<String> list){

        list.removeIf(t->t.startsWith("A")||t.endsWith("d"));
        return list.stream().distinct().collect(Collectors.toList());//[Tom, Cuneyt]

    }
    //9)List elemanlarinin karakter sayilarinin karelerini aliniz ve bir lis olarak rekrana yazdiriniz.
    public static List<Integer> PrintSquare(List<String> list){

      return  list.stream().map(Utils::get).collect(Collectors.toList());
    }
//
    public static List<String > printElement(List<String> list){
    return     list.stream().filter(t->t.length()%2==0).collect(Collectors.toList());

    }


    }













