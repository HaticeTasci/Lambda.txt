package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(4);
        nums.add(15);
        nums.add(15);
        nums.add(40);
        nums.add(131);
        nums.add(10);

        printElements1(nums);//12 9 4 12 15
        System.out.println();
        printElements2(nums);
        System.out.println();
        PrintEvenElements1(nums);//12 4 12
        System.out.println();
        printEvenElement2(nums);
        System.out.println();
        printSquareOfElements(nums);
        System.out.println();
        printCubeOfDistincOddElements(nums);//729 3375 2248091  kupü bulma
        System.out.println();
        printt(nums);//1860
        System.out.println();
        printc(nums);//368640000
        System.out.println();
        getMaxValue(nums);//131
        System.out.println();
        getValue3(nums);//131




    }

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");

        }
    }

    public static void printElements2(List<Integer> nums) {


        nums.stream().forEach(t -> System.out.print(t + " "));

    }

    public static void PrintEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }

    public static void printEvenElement2(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.println());
    }

    public static void printSquareOfElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

//tek sayiolan elemanlarinküplerini tekrarsiz olarak yazdiriniz.


    //burada surekli azaltma yaparak islem yapiyor.
    public static void printCubeOfDistincOddElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    public static void printt(List<Integer> nums) {

        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(sum);
    }

    public static void printc(List<Integer> nums) {

        Integer su = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.print(su);
    }
    public static void getMaxValue(List<Integer> nums){
      Integer max =  nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t >u ? t:u);
        System.out.println(max);

    }

    //siraliyoruz en sondaki en buyuk olani sec
    public static void getValue3(List<Integer> nums){
     Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);



    }
}
