import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        
        scanner.close();
    }
}
