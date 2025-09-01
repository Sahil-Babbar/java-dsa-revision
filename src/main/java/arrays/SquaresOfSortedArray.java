package main.java.arrays;

import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        int[] result = new int[arr.length];
        printArray(sortedSquares(arr, result));

    }

    static int[] sortedSquares(int[] arr, int[] result) {
        int start = 0;
        int end = arr.length - 1;
        int position = arr.length - 1;
        while (start <= end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                result[position] = arr[start] * arr[start];
                start++;
            } else {
                result[position] = arr[end] * arr[end];
                end--;
            }
            position--;
        }
        return result;
    }

    static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
