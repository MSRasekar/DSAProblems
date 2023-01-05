
import java.util.Scanner;

public class MinMaxEleArray {

    int min = 0;
    int max = 0;

    public void MinMaxCheck(int arr[], int size) {

        if (size == 1) {
            max = arr[0];
            min = arr[0];
        }

        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MinMaxEleArray objmm = new MinMaxEleArray();

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        objmm.MinMaxCheck(arr, size);
        System.out.println("Max No is : " + objmm.max);
        System.out.println("Min No is : " + objmm.min);

        sc.close();
    }
}