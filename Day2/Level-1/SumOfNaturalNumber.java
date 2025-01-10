import java.util.Scanner;

class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Checking if the number is a natural number;
        if (number >= 0){
            // Number is a natural number
            // Calculating the sum 
            int sum = (number * (number+1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        }
        else {
            // Number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close();
    }
}
