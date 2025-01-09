class CalculateDiscountedAmount {
	public static void main(String[] args) {
		
		//Total fee amount and discount percentage
		int fee = 125000, discountPercent = 10;
		
		//Calculation of discount: 
		int discount = fee * discountPercent / 100;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
		
	}
}