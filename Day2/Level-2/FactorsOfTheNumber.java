import java.util.Scanner;

class FactorsOfTheNumber {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);

        // Taking the number as input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding the factors 
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();  
    }
}

