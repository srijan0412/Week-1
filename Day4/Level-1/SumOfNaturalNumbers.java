import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Function Defination 
    public int sumOfNNaturalNumbers(int n) {
        // Using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        return sumFor;
    }
    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        SumOfNaturalNumbers obj = new SumOfNaturalNumbers();

        // Taking the number as input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        

        // function calling 
        int sum = obj.sumOfNNaturalNumbers(number);

        // output 
        System.out.println("The sum of n natural numbers is " + sum);

        // closing scanner class object 
        sc.close();
    }
}

