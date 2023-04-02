/* ============== Insertion Sort Using Java =============== */
/*
 * here we get a element form array and find it's sorted position in array 
 * i.e. get a element in temp variable and compare with its previous element 
 * if temp < previous_element --> make place for temp by shifting others to right
 */
import java.util.Scanner;

public class InsertionSort {

    // method to sort array using insertion sort algorithm..
    public void InsertionSorting(int arr[], int size){

        for (int i = 1; i < size; i++) {
            int temp = arr[i];
            int j = i-1;
            while ( j >=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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

        InsertionSort is = new InsertionSort();

        // array input with size from user
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is");
        is.printArray(arr, size);

        is.InsertionSorting(arr, size);

        System.out.println("Sorted Array is ");
        is.printArray(arr, size);

    }

}