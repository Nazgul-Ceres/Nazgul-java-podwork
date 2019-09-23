import java.util.Scanner;

public class JasonBonusWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        firstChar("", input);

        secondChar("", input);

        vowelsAndConsonants();

    }

    //    Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
    public static String firstChar(String str, Scanner input) {
        System.out.println("Please type a work: ");
        String aWord = input.nextLine();
        System.out.println(aWord.charAt(0));
        return str;
    }

    //    Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
    public static String secondChar(String str, Scanner input) {
        System.out.println("Enter a word: ");
        String aWord = input.nextLine();
        System.out.println(aWord.charAt(1));
        return str;
    }
    /*Create an application that allows the user to enter a sentence
    and tells them how many vowels and consonants were used.

    Example:

    input - "The hill are alive."
    output - 5 vowels and 10 consonants*/

    public static String vowelsAndConsonants() {
    Scanner input = new Scanner(System.in);
        System.out.println("Please write a sentence below.");
        String line = input.nextLine();

        int vowels = 0, consonants = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        return line;
    }
}
