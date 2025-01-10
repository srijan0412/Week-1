import java.util.Scanner;

class SmallerThanThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the numbers as input from the user
        System.out.print("Enter the number 1: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the number 2: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the number 3: ");
        int number3 = scanner.nextInt();
        
        boolean isSmaller = false;

        // Checking if the number 1 is smaller than other two or not
        if ((number1 < number2)  && (number1 < number3)) {
            isSmaller = true;
        }
        
        // printing the output
        System.out.println("Is the first number the smallest? " + isSmaller);
        scanner.close();
    }
}

