import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Taking input from the user
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();
        
        // Calculation of Total income
        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        scanner.close();
    }
}