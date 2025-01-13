import java.util.Scanner;

class CreateSubstring {
    public static void main(String[] args) {
        // Defining the scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter a string: ");
        String mainString = sc.next();
        
        System.out.print("Enter the starting index of the substring: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending index of the substring: ");
        int end = sc.nextInt();

        // Creating the substring with the help of .charAt() function 
        String substring1 = "";
        for (int i = 0; i < end; i++) {
            if (i >= start) {
                substring1 += mainString.charAt(i);
            }
        }

        // Creating the substring with the help of .substring() function 
        String substring2 = mainString.substring(start, end);

        // Output :
        System.out.println("The sub-Strings are : " + substring1 + " and " + substring2);
        System.out.println("Both are " + (substring1.equals(substring2) ? "Equal" : "Unequal"));
    }
}
