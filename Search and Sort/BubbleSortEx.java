/* ========= Bubble Sort using Java ========= */

import java.util.Scanner;

public class BubbleSortEx {

    // method to sort array using bubble sort algorithm
    public void BubbleSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // method to print array
    void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BubbleSortEx bs = new BubbleSortEx();

        // array input with size from user
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is");
        bs.printArray(arr, size);

        
        bs.BubbleSort(arr, size);

        System.out.println("Sorted Array is ");
        bs.printArray(arr, size);

    }

}