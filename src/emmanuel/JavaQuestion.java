package emmanuel;

public class JavaQuestion {
    public static void main(String[] args) {
        System.out.println(identify(5));
    }


    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}


/**
 Write  a method which can identify given number is even or odd
 Output ex:
 identify(5); ->"Odd"
 identify(6); ->"Even"
 */
