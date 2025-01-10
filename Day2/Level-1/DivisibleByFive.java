import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        boolean isDivisible = false;

        // Checking if the number is divisible by 5
        if (number%5 == 0) {
            isDivisible = true;
        }
        
        // printing the output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        scanner.close();
    }
}
