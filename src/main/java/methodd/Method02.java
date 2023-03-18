package methodd;

public class Method02 {

    public static void hosGeldiniz(){
        System.out.println("derse hosgeldiniz gencler");
        StringYazdir();
    }
    public static void isimSoy(String isim, String soyIsim ){
        System.out.println(isim + " "+ soyIsim);

    }
    public static void StringYazdir(){
        System.out.println("Iki sayini bolme yapiniz");
        Calculator.cikarma(12,5);
    }
    public static void Kapanma(){

        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }





        public static void main(String[] args) {

hosGeldiniz();
isimSoy("Yunus","Elmas");
isimSoy("Hatice","Elmas");
        StringYazdir();


    }




    }

