import java.util.Scanner;

class RemainderQuotient  {
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
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        

        // calling function 
        int result[] = RemainderQuotient.findRemainderAndQuotient(number, divisor);

        // Output 
        System.out.println("The remainder is " + result[0] + " and the quotient is " + result[1]);
        
        // Closing the scanner class object 
        sc.close();
    }
}
