import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Taking Year as input from the user.
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Checking if the year is valid 
        if (year < 1582) {
            System.out.println("Please enter a valid year.");
            scanner.close();
            return;
        }

        // Checking for a leap year
        if ((year % 4 == 0) && (year%100 != 0 || year%400 == 0)){
            System.out.println("The Year " + year + " is a Leap Year.");
        }
        else {
            System.out.println("The Year " + year + " is not a Leap Year.");
        }

        scanner.close();
    }
}

