import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome.
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters.
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        // If the first and last characters are not the same, it's not a palindrome.
        if (firstChar != lastChar) {
            return false;
        }

        // Recursively check the substring without the first and last characters.
        String substring = str.substring(1, str.length() - 1);
        return isPalindrome(substring);
    }
}
