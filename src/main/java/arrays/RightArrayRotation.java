package main.java.arrays;

import java.util.Scanner;

public class RightArrayRotation {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        int k= input.nextInt();
        int n= arr.length;
        System.out.println("original array");
        for(int element: arr){
            System.out.print(element+" ");
        }
        rightRotationByKElements(arr, k, n);
    }
   static void rightRotationByKElements(int arr[], int k, int n){
        k = k % n;

        // step 1: Reverse the whole array
       reverse(arr, 0, n-1);
       System.out.println("\nStep 1: Reverse the whole array");
       printArray(arr);

       // step 2: Reverse first k elements
       reverse(arr, 0, k-1);
       System.out.println("\nStep 2: Reverse first k elements");
       printArray(arr);

       // step 3: reverse last n-k elements
       reverse(arr, n-k-1, n-1);
       System.out.println("\nfinal Rotated array");
       printArray(arr);
    }

    // Helper function to reverse subarray
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Helper to print array
    static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
