import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ask and read the array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // 2. Declare and initialize the actual array
        int[] arr = new int[size];

        // 3. Store user elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // Store inside the array index, leaving 'i' untouched
        }

        // 4. Print the collected elements
        System.out.print("Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(+arr[i] + " ");
        }


        
        // Good practice to close scanner resource
        sc.close();
    }
}
