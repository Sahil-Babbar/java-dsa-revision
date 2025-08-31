package main.java.strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        boolean isValidPalindrome = isPalindrome(str);
        if(isValidPalindrome)
            System.out.println("valid palindrome");
        else
            System.out.println("invalid palindrome");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
