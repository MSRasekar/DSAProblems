/* ============== Selection Sort Using Java =============== */

import java.util.Scanner;

public class SelectionSort {

    // method to sort array using Selection sort algorithm..
    public void SelectionSoting(int arr[], int size) {
        
        for (int i = 0; i < size; i++) {
            int smallest = i;

            for (int j = i+1; j < size; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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

        SelectionSort ss = new SelectionSort();

        // array input with size from user
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is");
        ss.printArray(arr, size);

        
        ss.SelectionSoting(arr, size);       

        System.out.println("Sorted Array is ");
        ss.printArray(arr, size);

    }

}