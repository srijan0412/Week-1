import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);

        // Taking the number as input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Calculating the multiples below 100
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}

