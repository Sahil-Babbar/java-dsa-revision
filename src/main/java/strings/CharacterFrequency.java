package main.java.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = new String();
        Scanner input = new Scanner(System.in);
        str = input.next();
        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.containsKey(str.charAt(i)))
                charFreqMap.put(str.charAt(i), charFreqMap.get(str.charAt(i)) + 1);
            else
                charFreqMap.put(str.charAt(i), 1);
        }
        System.out.println(charFreqMap);
    }
}
