import java.util.Scanner;

public class NumberChecking {
    public static void main(String[] args) {
		//Initializing a Scanner class object 
        Scanner scanner = new Scanner(System.in);

        // Difining an array of size - 5
        int[] numbers = new int[5];

        // Taking 5 inputs from the user 
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //Checking for each, if its positive or negative
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Comparing the first and last element of tha array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        if (firstElement == lastElement) {
            System.out.println("The first and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Closing the scanner
        scanner.close();
    }
}