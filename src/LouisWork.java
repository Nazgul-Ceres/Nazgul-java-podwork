import java.util.Scanner;

public class LouisWork {
    static int[] a = {1, 1, 2, 1, 2, 3}; // should return true
    static int[] b = {1, 1, 2, 4, 1}; // should return false

    static int[] a1 = {1,2,3,4,5,6,7,8,9}; // should return 1
    static int[] a2 = {1,9,3,9,5,6,7,8,9}; // should return 3

    public static void main(String[] args) {
//        calculator();
//        System.out.println(beginningLetters("dogs"));
//        System.out.println(hasE("should output wrong"));
//        System.out.println(hasE("this should be true"));
        System.out.println(array123(a));
        System.out.println(array123(b));
        System.out.println(arrayCount9(a1));
        System.out.println(arrayCount9(a2));
        System.out.println(stringTimes("Two times", 2));
        System.out.println(stringTimes("Four times", 4));
    }
//    //================PROBLEM 1====================
////    https://java.codeup.com/extra-exercises/java/methods/
////    7. Create a command line calculator
//
//    public static void calculator() {
//        int num1 = 0;
//        int num2 = 0;
//        char operator;
//        double answer = 0;
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        num1 = userInput.nextInt();
//        System.out.print("Enter an operator: ");
//        operator = userInput.next().charAt(0);
//        System.out.print("Enter a second number: ");
//        num2 = userInput.nextInt();
//        switch (operator) {
//            case '+':
//                answer = num1 + num2;
//                break;
//            case '-':
//                answer = num1 - num2;
//                break;
//            case '*':
//                answer = num1 * num2;
//                break;
//            case '/':
//                answer = num1 / num2;
//                break;
//        }
//        System.out.printf("%d %s %d = %f\n", num1, operator, num2, answer);
//    }
//
//    //================PROBLEM 2====================
////    https://codingbat.com/prob/p183592
////    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
////    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
//
//    public static String beginningLetters(String str) {
//        int take = 2;
//        if (take > str.length()) {
//            take = str.length();
//        }
//        String front = str.substring(0, take);
//        return front + str + front;
//    }
//
//    //================PROBLEM 3====================
//    //    https://codingbat.com/prob/p173784
////    Return true if the given string contains between 1 and 3 'e' chars.
//
//    public static boolean hasE(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'e')
//                count++;
//        }
//        return (count >= 1 && count <= 3);
//    }


    // ============================================ N E W   P R O B L E M S============================================

    // #1
//    Given an array of ints, return the number of 9's in the array.
    public static int arrayCount9(int[] num) {
        int counter = 0;
        for (int i=0; i<num.length; i++) {
            if (num[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

    //#2
//    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public static boolean array123(int[] num) {
        for (int i=0; i < (num.length-2); i++) {
            if (num[i]==1 && num[i+1]==2 && num[i+2]==3)
                return true;
        }
        return false;
    }

    //#3
//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public static String stringTimes(String string, int num) {
        String output = "";
        for (int i=0; i<num; i++) {
            output = output + string;
        }
        return output;
    }
}