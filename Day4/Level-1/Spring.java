import java.util.Scanner;

public class Spring {
    // Function Defination 
    public boolean isSpring(int month, int day) {
        // Checking if the month and day lies in the Spring season
        if ((month == 3 && day >=20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        Spring obj = new Spring();

        // Taking the month-number & day as input from the user
        System.out.print("Enter the current month: ");
        int month = sc.nextInt();
        
        System.out.print("Enter the current day: ");
        int day = sc.nextInt();

        // function calling 
        boolean isSpring = obj.isSpring(month, day);

        // output 
        if (isSpring) {
            System.out.println("Its spring!");
        }
        else {
            System.out.println("Its not spring.");
        }

        // closing scanner class object 
        sc.close();
    }
}
