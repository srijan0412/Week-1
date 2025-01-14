import java.util.Scanner;

class ToLowercase {
    // Method to convert upper-case string to lower-case string 
    public static String toLowercase(String testString) {
        int stringSize = testString.length(); //Length of the array
        String lowercaseString = "";
        for (int i = 0; i < stringSize; i++) {
            lowercaseString += (char)(testString.charAt(i) + 32);
        }
        return lowercaseString;
    }
    public static void main(String[] args) {
        //Defining a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the String: ");
        String testString = sc.next();

        // output 
        System.out.println("The lower-case string is " + ToLowercase.toLowercase(testString));
        
        //closing the scanner object
        sc.close();
    }
}
