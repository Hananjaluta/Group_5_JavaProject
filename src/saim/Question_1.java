package saim;

public class Question_1 {

    public static void main(String[] args) {

        System.out.println(identifyNum(5));
        System.out.println(identifyNum(6));


        /**
        Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
         */
    }
    public static String identifyNum(int n){

        if(n %2 ==0){
            return "Even";
        }else
            return "Odd";


    }



}
