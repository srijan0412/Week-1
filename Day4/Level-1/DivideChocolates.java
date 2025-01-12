import java.util.Scanner;

class DivideChocolates  {
    // Function defination 
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainderQuotient[] = new int[2];

        remainderQuotient[0] = number % divisor;
        remainderQuotient[1] = number / divisor;

        return remainderQuotient;
    }

    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        

        // calling function 
        int result[] = DivideChocolates.findRemainderAndQuotient(numberOfChocolates, numberOfStudents);

        // Output 
        System.out.println("The Chocolates that are equally distributed are " + result[1] + " and the remaining chocolates are " + result[0]);
        
        // Closing the scanner class object 
        sc.close();
    }
}
