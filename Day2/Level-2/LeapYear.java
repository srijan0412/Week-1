import java.util.Scanner;

public class LeapYear {
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
        if (year % 4 == 0){
            if (year % 100 != 0){
                // leap year 
                System.out.println("The Year " + year + " is a Leap Year.");
            }
            else {
                if (year % 400 == 0) {
                    // Leap year 
                    System.out.println("The Year " + year + " is a Leap Year.");
                }
                else {
                    System.out.println("The Year " + year + " is not a Leap Year.");
                }
            }
        }
        else {
            System.out.println("The Year " + year + " is not a Leap Year.");
        }
    
    
        scanner.close();
    }
}
