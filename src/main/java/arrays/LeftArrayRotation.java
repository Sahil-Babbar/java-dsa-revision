package main.java.arrays;

import java.util.Scanner;

public class LeftArrayRotation {
    public static void main(String[] args) {
        int originalArray[]= {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        int k= input.nextInt();
        int n= originalArray.length;
        System.out.println("original array");
        printArray(originalArray);
        leftRotationByKElements(originalArray, k, n);
    }
    static void leftRotationByKElements(int arr[], int k, int n) {
        k = k % n; // handle k > n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        System.out.println("\nStep 1: Reverse the whole array");
        printArray(arr);

        // Step 2: Reverse last k elements
        reverse(arr, n - k, n - 1);
        System.out.println("\nStep 2: Reverse last k elements");
        printArray(arr);

        // Step 3: Reverse first n-k elements
        reverse(arr, 0, n - k - 1);
        System.out.println("\nFinal Rotated Array: ");
        printArray(arr);
    }
    // Helper function to reverse subarray [start..end]
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
