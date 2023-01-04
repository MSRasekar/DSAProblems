import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array..");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
        }
        
    }
}