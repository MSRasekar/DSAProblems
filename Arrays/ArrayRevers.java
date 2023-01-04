import java.util.Scanner;

/* 
1) Initialize start and end indexes as start = 0, end = n-1 
2) In a loop, swap arr[start] with arr[end] and change start and end as follows : 
start = start +1, end = end – 1
 */
public class ArrayRevers {

    // by iterative way
    static void ReversArray(int arr[], int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            int temp;
            while (start < end) {
                temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }
    }

    // by recursive way
    static void ReversArrayRec(int arr[], int start, int end) {

        int temp;

        if (start >= end) {
            return;
        }
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        ReversArrayRec(arr, start + 1, end - 1);
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

        System.out.println("Original Array");
        printArray(arr, size);

        // ReversArray(arr, 0, size - 1);

        // System.out.println("Reversed Array");
        // printArray(arr, size);

        System.out.println("By Recursive way");
        ReversArrayRec(arr, 0, size - 1);
        printArray(arr, size);
    }
}