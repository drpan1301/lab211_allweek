package FindElement;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements : ");
        int size = scanner.nextInt();
        System.out.print("Enter the scope : ");
        int scope = scanner.nextInt();
        int[] arr = FindingElement.generateRandomArray(size, scope);
        System.out.println("The array: " + Arrays.toString(arr));
        System.out.print("Enter search value: ");
        int searchNum = scanner.nextInt();
        int index = FindingElement.findIndex(arr, searchNum);
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
