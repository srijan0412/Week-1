import java.util.Scanner;


public class SumOfNaturalNumbers {
    public static int SumOfNaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SumOfNaturalNo(n-1);
    }

    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        
        // Taking number as input from the user 
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Checking if the number is natural number or not 
        if (number < 0) {
            System.out.println("Please Enter a Natural number.");
            sc.close();
            return;
        }

        // Calling the function 
        int sumFunction = SumOfNaturalNumbers.SumOfNaturalNo(number);
        int sumFormulae = number * (number+1) / 2;
        

        // Output 
        System.out.println("The Sum of n natural numbers by recursive function is " + sumFunction);
        System.out.println("The Sum of n natural numbers by formulae is " + sumFormulae );
        System.out.println("if we compare both, they are - " + (sumFormulae == sumFunction ? "Same" : "Not same") );
        
        // Closing the scanner class object 
        sc.close();
    }
}
