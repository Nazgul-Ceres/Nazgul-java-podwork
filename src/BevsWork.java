import java.util.Scanner;

public class BevsWork {
    public static void main(String[] args) {

//        https://codingbat.com/java/Warmup-1

        System.out.println(sleepIn(true, false));
        System.out.println(diff21(2));
        System.out.println(monkeyTrouble(true, true));


//        ----BONUS 1
//        Create date format converter application.
//                Take in the following format:
//        MM/DD/YYYY
//        Output the following:
//        MonthName DD, YYYY
//        Example:
//        input - 12/01/1999
//        output - December 12, 1999

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

//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
//3---------------------------------------------------------------------------------------------------------------------


//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//
//
//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
           return (aSmile == bSmile);
    }

}
