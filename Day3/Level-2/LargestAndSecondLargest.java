import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Initializing the scanner class object 
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define the maximum number of digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extract digits and store them in the array
        while (number != 0) {
            if (index < maxDigit) {
                digits[index] = number % 10; // Get the last digit
                number /= 10; // Remove the last digit
                index++;
            } else {
                break; // Break if maxDigit is reached
            }
        }
        
        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        
        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }
        
        // Display results
        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
        } else {
            System.out.println("No digits found.");
        }
        
        if (secondLargest != -1) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
        
        // Closeing the scanner
        scanner.close();
    }
}
