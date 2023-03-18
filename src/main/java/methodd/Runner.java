package methodd;

public class Runner {

    public static void main(String[] args) {


        Method01 obj = new Method01();

        System.out.println(obj.isActiv);
        System.out.println(obj.okul);
        System.out.println(obj.yil);

        Method01.okulIsmiYazdir("Start okulu");
        Method01.ilIsmiYazdir("Istanbul");
        Method01.yil(1993);
        System.out.println(   obj.isActiv(false));
        Calculator.cikarma(12,1);
        Calculator.cikarma(500,400);
    }

}
