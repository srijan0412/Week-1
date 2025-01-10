import java.util.Scanner;

public class IsSpring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the month-number & day as input from the user
        System.out.print("Enter the current month: ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the current day: ");
        int day = scanner.nextInt();
        
        // Checking if the month and day lies in the Spring season
        if ((month == 3 && day >=20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("Its is a Spring Season.");
        }
        else {
            System.out.println("Not a Spring Season.");
        }
        
        scanner.close();
    }
}
