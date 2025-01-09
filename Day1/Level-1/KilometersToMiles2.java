import java.util.Scanner;

class KilometersToMiles2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking Distance from the user
		double km = input.nextDouble();
		
		//Calculating total miles from Kilometers
		double miles = km / 1.6;
		
		System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
		input.close();
		
	}
}