import java.lang.Math;
import java.util.Scanner;

public class FindFactors {
    // Function defination
    public static int sumOfFactors(int factors[], int Count) {
        int sum = 0;
        for (int i = 0; i < Count; i++){
            sum += factors[i];
        }
        return sum;
    } 

    public static int sumOfSquaresOfFactors(int factors[], int Count) {
        int sum = 0;
        for (int i = 0; i < Count; i++){
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    } 

    public static int productOfFactors(int factors[], int Count) {
        int product = 1;
        for (int i = 0; i < Count; i++){
            product *= factors[i];
        }
        return product;
    } 
    
    public static int[] findFactors(int number) {
        // Finding the number of factors 
        int factorCount = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                factorCount++;
            }
        }

        // Storing the factors in the array 
        int factors[] = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }
    
    public static void main(String[] args){
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
    
        // Taking number as input from the user 
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Calling the function 
        int factors[] = FindFactors.findFactors(number);
        int factorCount = factors.length;
        int sum = FindFactors.sumOfFactors(factors, factorCount);
        int sumOfSquares = FindFactors.sumOfSquaresOfFactors(factors, factorCount);
        int product = FindFactors.productOfFactors(factors, factorCount);
        
        // Output 
        System.out.println("The factors are as follow: ");
        for (int i = 0; i < factorCount; i++) {
            System.out.print(" " + factors[i]);
        }
        System.out.println();
        System.out.println("Sum of the factors is " + sum );
        System.out.println("Product of the factors is " + product );
        System.out.println("Sum of Squares of the factors is " + sumOfSquares );
        
        // Closing the scanner class object 
        sc.close();
    }
}

