package main.java.strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramsCheck {
    public static void main(String[] args) {
        String firstInputString = new String();
        String secondInputString = new String();
        Scanner input = new Scanner(System.in);
        firstInputString = input.next();
        secondInputString = input.next();

        HashMap<Character, Integer> firstCharFreqMap = findFreqMap(firstInputString);
        HashMap<Character, Integer> secondCharFreqMap = findFreqMap(secondInputString);

        if (firstCharFreqMap.equals(secondCharFreqMap))
            System.out.println("they are anagrams");
        else
            System.out.println("they are not anagrams");

    }

    static HashMap<Character, Integer> findFreqMap(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == ' ')
                continue;
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        return freqMap;
    }
}
