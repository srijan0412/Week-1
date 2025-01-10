import java.util.Scanner;

class MeanHeight{
	public static void main(String [] args){
		//Initializing a Scanner class object 
		Scanner sc = new Scanner(System.in);
		
		//Defining an array of size - 11
		double arr [] = new double[11];
		
		//Initializing sum variable 
		double sum = 0.0;
		
		//Taking input from the user
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter the height of " + (i+1) + " player: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}

		// Calcuateing the mean height
		double mean = sum/11;
		
		//Display the mean height
		System.out.println("The mean height is " + mean);

        sc.close();
	}
}