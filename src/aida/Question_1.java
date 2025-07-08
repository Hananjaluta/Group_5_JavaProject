package aida;

public class Question_1 {
    public static void main( String[] args) {

       /*
        Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
         */

        identifyOddEven(5);
        identifyOddEven(6);

    }

    public static void identifyOddEven(int number){
        if (number %2==0){
            System.out.println(number+ " - Even number");
        }else {
            System.out.println(number + " - Odd number");
        }
    }
}
