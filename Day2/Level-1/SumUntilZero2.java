import java.util.Scanner;

class SumUntilZero2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initializing the sum as zero 
        double sum = 0;

        // Taking input from the user until he enters 0 or the number he enters is negative
        double input = 1;
        while (input != 0) {
            System.out.print("Enter the number: ");
            input = scanner.nextDouble();

            // If the User enters a negative number this loop will be terminated
            if (input < 0) break;

            sum += input;
        }

        System.out.println("The total value is " + sum);
        scanner.close();
    }
}

