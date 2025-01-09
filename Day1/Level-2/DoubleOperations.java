import java.util.Scanner;

class DoubleOperations {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Taking a, b and c as input from the user
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        
        // Calculating the given equation
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4 );        
        scanner.close();
    }
}
