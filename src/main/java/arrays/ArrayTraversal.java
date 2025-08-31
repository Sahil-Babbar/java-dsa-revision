package main.java.arrays;

import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i =0 ; i <5 ; i++){
            arr[i]= input.nextInt();
        }
        // traverse and print elements
        for(int element : arr){
            System.out.print(element+ " ");
        }
    }
}
