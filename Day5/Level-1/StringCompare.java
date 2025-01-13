import java.util.Scanner;

class StringCompare {
    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter string 1: ");
        String string1 = sc.next();

        System.out.print("Enter string 2: ");
        String string2 = sc.next();
        
        // Checking if the strings are of same length 
        if (string1.length() != string2.length()) {
            System.out.println("Your strings are not of same size.");
            sc.close();
            return;
        }

        // Checkinf if the strings are equal with .charAt() function 
        int stringSize = string1.length();
        for (int i = 0; i < stringSize; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                System.out.println("String1 is not equal to string2, by .charAt() function.");
            }
        }
        System.out.println("String1 is equal to string2, by .charAt() function.");

        // Checking if the strings are equal with .equal() function 
        if (string1.equals(string2)) {
            System.out.println("String1 is equal to string2, by equals() function.");
        }
        else {
            System.out.println("String1 is not equal to string2, by equals() function.");
        }

        // Closing the scanner object 
        sc.close();
    }
}
