import java.util.Scanner;

import java.util.*;

public class BinarySearch {
    public static int BinarySearching(int arr[], int size, int key) {

        int low = 0, high = size - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is..");
        printArray(arr, size);

        Arrays.sort(arr);

        System.out.println("sorted array..");
        printArray(arr, size);
        System.out.println("Enter a Number to Search");
        int key = sc.nextInt();

        int residx = BinarySearching(arr, size, key);

        if (residx == -1) {
            System.out.println("Key Element is Not Found");
        } else {
            System.out.println("Key Element " + key +" is found at index " + residx);
        }
    }
}