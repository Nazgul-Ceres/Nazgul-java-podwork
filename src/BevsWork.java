import java.util.Scanner;

public class BevsWork {
    public static void main(String[] args) {

//        https://codingbat.com/java/Warmup-1

        System.out.println(sleepIn(true, false));


        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int numInput = input.nextInt();
        System.out.println(diff21(numInput));


        System.out.println("enter another number");
        int numInput2 = input.nextInt();
        System.out.println(sumDouble(numInput, numInput2));

    }

//1---------------------------------------------------------------------------------------------------------------------

//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//
//    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

//2---------------------------------------------------------------------------------------------------------------------

    //    Given an int n, return the absolute difference between n and 21
//a number minus 21 using user input
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0
    public static int diff21(int numInput) {
        System.out.println("your number minus 21 is : ");
        return (+numInput - 21);
    }

//3---------------------------------------------------------------------------------------------------------------------




    public static int sumDouble(int numInput, int numInput2) {
        // Store the sum in a local variable
        int sum = numInput + numInput2;

        // Double it if a and b are the same
        if (numInput == numInput2) {
            sum = sum * 2;
        }

        return sum;
    }
}