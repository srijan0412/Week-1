import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        
        // Input years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate bonus
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus for more than 5 years of service
        }

        // Print the bonus amount
        System.out.println("Bonus amount: " + bonus);
        
        // Close the scanner
        scanner.close();
    }
}