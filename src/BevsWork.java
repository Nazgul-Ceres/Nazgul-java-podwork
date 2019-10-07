import java.util.Scanner;

public class BevsWork {




    public static void main(String[] args) {

//        https://codingbat.com


        System.out.println(nearHundred(10));
        System.out.println(parrotTrouble(true, 9));
        System.out.println(makes10(12,4));


    }

//1---------------------------------------------------------------------------------------------------------------------


//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

//2---------------------------------------------------------------------------------------------------------------------
//
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
public static boolean parrotTrouble(boolean talking, int hour) {
    return (talking && (hour < 7 || hour > 20));
}

//3---------------------------------------------------------------------------------------------------------------------


//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }


}