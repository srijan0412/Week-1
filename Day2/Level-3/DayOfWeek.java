import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
		// Initializing the scanner object 
        Scanner input = new Scanner(System.in);

		// Taking month (m), day (d) and year (y) as input from the user.
        System.out.print("Enter the month: ");
        int m = input.nextInt();
		
        System.out.print("Enter the day: ");
        int d = input.nextInt();
		
        System.out.print("Enter the year: ");
        int y = input.nextInt();

		//Calculating the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

		//Output
        System.out.println("Day of the week: " + d0);

		input.close();
    }
}
