class ProfitNLoss {
	public static void main(String[] args) {
		
		//Cost price and Sell price of the product
		int costPrice = 129, sellingPrice = 191;
		
		//Profit on sales
		int profit = sellingPrice - costPrice;
		
		//Profit percentage calculation: 
		double profitPercentage = (double)profit / (double)costPrice * 100;
		
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nTHe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
		
	}
}