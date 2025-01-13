import java.util.Scanner;

class DisplayCalender {
    // Method to get the month-name from the month number 
    public static String getMonth(int month) {
        String Month[] = {" ","January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return Month[month];
    }

    // Method to Check if the given year is a leap year 
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year%100 != 0 || year%400 == 0)){
            return true;
        }
        return false;
    }

    // Method to get the Days in a month
    public static int getDaysInAMonth(int month, int year) {
        // Array that stores the total number of days in each month 
        int Days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Edge - case for leap year 
        if (isLeapYear(year) && month == 2) {
            return (Days[month] + 1);
        }

        return Days[month];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust year and month based on the formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // Returns the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to displayCalender
    public static void displayCalender(int yy, int mm) {
        // Show Month and Year 
        System.out.println(getMonth(mm) + " " + yy);

        // Show Days of the week 
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Show weekly dates 
        int firstDay = getFirstDayOfMonth(mm, yy);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        // Print the days of the month
        int daysInMonth = getDaysInAMonth(mm, yy);
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day with a width of 3, right justified
            System.out.printf("%3d", day);
            System.out.print(" ");
            
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking year and month as input from the user 
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        
        System.out.print("Enter the Month: ");
        int month = sc.nextInt();

        // Displaying the calender 
        DisplayCalender.displayCalender(year, month);
        sc.close();
    }
}
