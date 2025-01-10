import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initializing the sum as zero 
        double sum = 0;

        // Taking input from the user until he enters 0
        double input = -1;
        while (input != 0) {
            System.out.print("Enter the number: ");
            input = scanner.nextDouble();
            sum += input;
        }

        System.out.println("The total value is " + sum);
        scanner.close();
    }
}
