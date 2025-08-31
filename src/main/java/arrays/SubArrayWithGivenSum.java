package main.java.arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the target sum");
        int targetSum = input.nextInt();

        int arr[] = new int[5];
        System.out.println("enter the elements");
        for (int index = 0; index < 5; index++) {
            arr[index] = input.nextInt();
        }
        findSubArrayWithGivenSum(arr, targetSum);
    }

    public static void findSubArrayWithGivenSum(int arr[], int targetSum) {
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < arr.length) {
            sum += arr[end];

            while (sum > targetSum) {
                sum -= arr[start];
                start++;
            }

            if (sum == targetSum) {
                System.out.println("Subarray found:");
                printSubArray(arr, start, end);
                break;
            }
            end++;
        }
        if (end == arr.length) {
            System.out.println("not found");
        }
    }

    public static void printSubArray(int arr[], int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i]);
        }
    }
}
