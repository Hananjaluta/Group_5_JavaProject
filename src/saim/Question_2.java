package saim;

public class Question_2 {
    public static void main(String[] args) {


        /**
         Write a function which prints out the numbers
         from 1 to 30 but for numbers which are a multiple of 3,
         print "FIN" instead of the number and
         for numbers which are a multiple of 5,
         print "RA" instead of the number.
         For numbers which are a multiple of both 3 and 5,
         print "FINRA" instead of the number.
         */

        finra_Q();

    }

    public static void finra_Q() {



        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fin");
            } else if (i % 3 == 0) {
                System.out.println("fin");
            } else if (i % 5 == 0) {
                System.out.println("ra");
            } else {
                System.out.println(i);

            }
        }
    }
}
