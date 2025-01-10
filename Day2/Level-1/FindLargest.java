import java.util.Scanner;

class FindLargest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the numbers as input from the user
        System.out.print("Enter the number 1: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the number 2: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the number 3: ");
        int number3 = scanner.nextInt();
        
        // Initializing the booleans as false 
        boolean isNumber1Biggest = false;
        boolean isNumber2Biggest = false;
        boolean isNumber3Biggest = false;

        // Checking which number is the biggest
        if (number1 > number2) {
            if (number1 > number3) {
                isNumber1Biggest = true;
            }
            else {
                isNumber3Biggest = true;
            }
        }
        else {
            if (number2 > number3) {
                isNumber2Biggest = true;
            }
            else {
                isNumber3Biggest = true;
            }
        }
        
        // printing the output
        System.out.println("Is the first number the smallest? " + isNumber1Biggest);
        System.out.println("Is the second number the smallest? " + isNumber2Biggest);
        System.out.println("Is the third number the smallest? " + isNumber3Biggest);
        scanner.close();
    }
}
