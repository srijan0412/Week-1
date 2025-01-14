import java.util.Scanner;

class NumberFormatExceptionDemo {
    // getNumberFormatException() is a function that causes a NullPointerException
    public static void getNumberFormatException(String testString) {
        // The  below line will generate a Exception
        int number = Integer.parseInt(testString);
        System.out.println(number);
    }

    public static void main(String[] args) {
        // Creating a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from ther user 
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Trying to catch and manage the error 
        try {
            NumberFormatExceptionDemo.getNumberFormatException(text);
        }
        catch(NumberFormatException e) {
            System.out.println("Number Format Exception - " + e.getMessage());
        }

        // Closing the scanner class object 
        sc.close();
    }
}
