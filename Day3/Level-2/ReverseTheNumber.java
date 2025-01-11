import java.util.Scanner;

class ReverseTheNumber {
    public static void main(String[] args){
        // Initializing the Scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking number as input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Finding the number of digits in the number 
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber > 0){
            digitCount++;
            tempNumber /= 10;
        }

        //Storing the digits in an array
        int digits[] = new int[digitCount];
        int index = 0;
        while (number > 0){
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            number /= 10;
            index ++;
        }

        // Printing in reverse order
        System.out.print("The number in reverse is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
