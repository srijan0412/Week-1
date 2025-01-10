import java.util.Scanner;
import java.util.Arrays;

class FlexibleArray {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Define an array
        double arr[] = new double[10];

        // Initialize sum and index variables
        int index = 0;
        double sum = 0;

        // Infinite loop
        while (true) {
            // Read input
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Assign the input to the array and increment the index
            arr[index] = input;
            index++;

            // Break if the array is full
            if (index == 10) {
                break;
            }
        }

        // Calculate the total sum
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }

        // Display the array elements and the total sum
        System.out.println("Numbers entered: " + Arrays.toString(Arrays.copyOf(arr, index)));
        System.out.println("Total value: " + sum);

        sc.close();
    }
}
