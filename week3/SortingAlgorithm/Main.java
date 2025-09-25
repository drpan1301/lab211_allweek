package SortingAlgorithm;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SortingAlgorithm sorter = new SortingAlgorithm();

        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        while(!getValidInt(n)){
            System.out.println("Invalid Input !!!  Please Enter again:");
            n = sc.nextInt();
       }

        int[] arr = new int[n];
        sorter.generateRandomArray(arr);
        System.out.print("Unsorted Array: [");
        sorter.printArray(arr);
        System.out.print("]\nSorted Array: [");
        //sorter.bubbleSort(arr);
        sorter.quickSort(arr,0,arr.length -1);
        sorter.printArray(arr);
        System.out.println("]");
    }

    private static boolean getValidInt(int n) {
        return n > 0;
    }



    

}