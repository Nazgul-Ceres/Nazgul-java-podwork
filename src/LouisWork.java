import java.util.Scanner;
public class LouisWork {
    public static void main(String[] args) {
        calculator();
        System.out.println(beginningLetters("dogs"));
        System.out.println(hasE("should output wrong"));
        System.out.println(hasE("this should be true"));
    }
    //================PROBLEM 1====================
//    https://java.codeup.com/extra-exercises/java/methods/
//    7. Create a command line calculator

    public static void calculator() {
        int num1=0;
        int num2=0;
        char operator;
        double answer=0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = userInput.nextInt();
        System.out.print("Enter an operator: ");
        operator = userInput.next().charAt(0);
        System.out.print("Enter a second number: ");
        num2 = userInput.nextInt();
        switch (operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
        }
        System.out.printf("%d %s %d = %f\n", num1, operator, num2, answer);
    }

    //================PROBLEM 2====================
//    https://codingbat.com/prob/p183592
//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
//    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    public static String beginningLetters(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    //================PROBLEM 3====================
    //    https://codingbat.com/prob/p173784
//    Return true if the given string contains between 1 and 3 'e' chars.

    public static boolean hasE(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count>=1 && count<=3);
    }
}