package Input_and_Output;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 2;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
        int x = getIntLBYL();
        System.out.println("x is " + x);
        int y = getIntEAFP();
        System.out.println("y is " + y);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    // Methods LBYL Look Before You Leap
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    // Method EAFP Easy to Ask for Forgiveness then Permission.
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    // Methods LBYL Look Before You Leap
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    // Method EAFP Easy to Ask for Forgiveness then Permission.
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
