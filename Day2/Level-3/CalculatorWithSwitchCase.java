import java.util.Scanner;

class CalculatorWithSwitchCase{
    public static void main(String[] args) {
		//taking input using scanner class by creating object
        Scanner input = new Scanner(System.in);

        // Taking the number1, number2 & Operator as input from the user 
        System.out.print("Enter first number: ");
        double firstOperant = input.nextDouble();
		
        System.out.print("Enter second number: ");
        double secondOperant = input.nextDouble();
		
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = input.next();

        // Using switch-case to implement calculator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstOperant + secondOperant));
                break;
            case "-":
                System.out.println("Result: " + (firstOperant - secondOperant));
                break;
            case "*":
                System.out.println("Result: " + (firstOperant * secondOperant));
                break;
            case "/":
                if (secondOperant != 0) {
                    System.out.println("Result: " + (firstOperant / secondOperant));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

	    input.close();
    }
}
