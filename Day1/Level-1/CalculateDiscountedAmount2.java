import java.util.Scanner;

class CalculateDiscountedAmount2 {
	public static void main(String[] args) {
		
		//Initializing scanner class object
		Scanner input = new Scanner(System.in);
		
		//Taking Total fee amount and discount percentage from the user
		System.out.print("Enter fee: ");
		int fee = input.nextInt();
		
		System.out.print("Enter Discount-percentage: ");
		int discountPercent = input.nextInt();
		
		//Calculation of discount: 
		int discount = fee * discountPercent / 100;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
		input.close();
		
	}
}