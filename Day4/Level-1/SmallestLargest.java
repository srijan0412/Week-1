import java.util.Scanner;
import java.lang.Math;

class SmallestLargest {
    // function defination 
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallestLargest[] = new int[2];

        // Calculating smallest and largest 
        smallestLargest[0] = Math.min(number1, Math.min(number1, number2));
        smallestLargest[1] = Math.max(number1, Math.max(number2, number3));

        return smallestLargest;
    }

    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter number-1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number-2: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter number-3: ");
        int number3 = sc.nextInt();

        // calling function 
        int result[] = SmallestLargest.findSmallestAndLargest(number1, number2, number3);

        // Output 
        System.out.println("The Smallest number is " + result[0] + " and the largest number is " + result[1]);
        
        // Closing the scanner class object 
        sc.close();
    }
}
