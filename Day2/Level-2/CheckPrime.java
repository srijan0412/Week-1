import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // initializing the isPrime variable
        boolean isPrime = true;

        // Checking for prime (if number is divisible by any number from 2 to n-1 )
        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        // Output 
        if (isPrime) {
            System.out.println("Then number " + number + " is a Prime.");
        }
        else {
            System.out.println("Then number " + number + " is not a Prime.");
        }

        scanner.close();
    }
}
