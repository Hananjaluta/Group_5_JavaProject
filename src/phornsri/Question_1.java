package phornsri;

public class Question_1 {

    public static void main(String[] args) {


        /**
        Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
         */
        if(5 % 2 == 0) {
            System.out.println("Odd");
        } if (6 % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Invalid");
        }

        System.out.println("Compleated");
    }
}
