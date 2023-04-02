import java.util.Scanner;

/* ========= Linear Serach Algorithm in Java ========== */

public class LinearSearch {

    // method to find key element in array by linear searching
    public void linearSearch(int arr[], int size, int key) {
        int i = 0;
        boolean flag = false;
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("The Key element " + key+ " is found at index " + i);
        } else {
            System.out.println("Element is Not Found");
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinearSearch ls = new LinearSearch();

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is..");
        printArray(arr, size);

        System.out.println("Enter a Number to Search");
        int key = sc.nextInt();
        ls.linearSearch(arr, size, key);
    }

}