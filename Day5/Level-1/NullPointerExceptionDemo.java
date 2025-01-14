import java.util.Scanner;

class NullPointerExceptionDemo {
    // getNullPointerError() is a function that causes a NullPointerException
    public static void getNullPointerError(String testString) {
        // The  below line will generate a null pointer exception
        System.out.println(testString.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from ther user 
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Trying to catch and manage the error 
        try {
            NullPointerExceptionDemo.getNullPointerError(text);
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception " + e.getMessage());
        }
    }    
}
