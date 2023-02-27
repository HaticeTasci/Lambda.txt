package byPass_value;

public class PassByValue01 {
    public static void main(String[] args) {


        int watchPrice=120;

        studentWatchPrice(120,10);
        TeacherWatchPrice(watchPrice,20);
        otherWatchPrice(watchPrice,5);
        System.out.println("original price  --->"+watchPrice);

    }

    public static void  studentWatchPrice(int watchPrice,int discount){
        int discountForStudent =watchPrice-discount;
        System.out.println("After discount ---->" +discountForStudent);
    }

    public static void  TeacherWatchPrice(int watchPrice,int discount){
        int discountForStudent =watchPrice-discount;
        System.out.println("After discount ---->" +discountForStudent);
    }

    public static void  otherWatchPrice(int watchPrice,int discount){
        int discountForStudent =watchPrice-discount;
        System.out.println("After discount ---->" +discountForStudent);
    }


}