package emmanuel;

public class JavaQuestion2 {
    public static void main(String[] args) {
       printFINRA();


    }

    public static void printFINRA() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);

            }
        }
    }
}






/*
/**
         Write a function which prints out the numbers
         from 1 to 30 but for numbers which are a multiple of 3,
         print "FIN" instead of the number and
         for numbers which are a multiple of 5,
         print "RA" instead of the number.
         For numbers which are a multiple of both 3 and 5,
         print "FINRA" instead of the number.
         */
