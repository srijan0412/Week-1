import java.util.Scanner;

class LeapYear {
    // Function defination 
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year%100 != 0 || year%400 == 0)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
    
        // Taking year as input from the user 
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        // Calling the function 
        boolean isLeap = LeapYear.isLeapYear(year);
        
        // Output 
        if (isLeap) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
        
        // Closing the scanner class object 
        sc.close();
    }
}
