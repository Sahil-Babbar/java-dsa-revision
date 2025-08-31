package main.java.prefixsum;

public class PrefixSumBasics {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n= arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.print("prefix sum: ");
        for(int element : prefix){
            System.out.print(element + " ");
        }
    }
}
