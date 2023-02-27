package byPass_value;

public class PassByValue003 {
    public static void main(String[] args) {
        //Creating A Single Element Array & Passing As A Parameter

        // single element array
        int a[] = {10};

        // Before calling the add() method
        System.out.println("Before calling method: " +a[0]);

        // calling method
        add(a);

        // After calling the add() method
        System.out.println("after calling method: " +a[0]);

    }

    // add() method starts here that increments 'a' by 1
    public static void add(int a[]) {
        a[0]++;
    }
}