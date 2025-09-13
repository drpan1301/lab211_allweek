package FindElement;

import java.util.Random;

public class FindingElement {

    public static int[] generateRandomArray(int size, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max + 1);
        }
        return arr;
    }

    public static int findIndex(int[] arr, int searchNum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                return i;
            }
        }
        return -1;
    }
}