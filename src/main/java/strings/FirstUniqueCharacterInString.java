package main.java.strings;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = new String();
        Scanner input = new Scanner(System.in);
        str = input.next();

        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            charFreqMap.put(str.charAt(i),
                    charFreqMap.getOrDefault(str.charAt(i), 0) + 1);
        }

        boolean uniqueCharFound = false;
        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.get(str.charAt(i)) == 1) {
                uniqueCharFound = true;
                System.out.println("first unique character : " + str.charAt(i));
                break;
            }

        }
        if (!uniqueCharFound)
            System.out.println("no unique char in given string");
    }
}
