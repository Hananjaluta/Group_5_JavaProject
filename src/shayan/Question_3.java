package shayan;

public class Question_3 {

    public static void main(String[] args) {
// Swap two variables' values without using a third variable
        int a = 5;
        int b = 10;

        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
