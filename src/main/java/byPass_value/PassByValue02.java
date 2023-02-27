package byPass_value;

public class PassByValue02 {

    public static void main(String[] args) {

        String question="What is your Level in java";

        String result=  putQuestionMark(question);
        System.out.println(result);

        System.out.println(question);

    }

    public static String putQuestionMark(String str){
        return str+ "?";
    }


}