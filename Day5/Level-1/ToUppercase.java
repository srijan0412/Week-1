import java.util.Scanner;

class ToUppercase {
    // Method to convert lower case string to upper case string 
    public static String toUpperCase(String testString) {
        int stringSize = testString.length(); //Length of the array
        String uppercaseString = "";
        for (int i = 0; i < stringSize; i++) {
            uppercaseString += (char)(testString.charAt(i) - 32);
        }
        return uppercaseString;
    }
    public static void main(String[] args) {
        //Defining a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the String: ");
        String testString = sc.next();

        // output 
        System.out.println("The upper-case string is " + ToUppercase.toUpperCase(testString));
        
        //closing the scanner object
        sc.close();
    }
}
