package main.java.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (freqMap.containsKey(arr[i]))
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            else
                freqMap.put(arr[i], 1);
        }
        System.out.println(freqMap);
    }
}
