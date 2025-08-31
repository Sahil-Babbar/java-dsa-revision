package main.java.arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
