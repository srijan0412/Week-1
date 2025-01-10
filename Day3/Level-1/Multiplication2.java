import java.util.Scanner;

class Multiplication2{
	public static void main(String [] args){
		//Initializing a Scanner class object 
		Scanner sc = new Scanner(System.in);
		
		//Defining an array of size - 4
		int arr [] = new int[4];
		
		//Taking input from the user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		//Storing multiplication of number in array
		for(int i=0; i<arr.length; i++){
			arr[i] = number * (i+6);
			// Display the multiplication table
			System.out .println(number+" * "+ (i+6) + " = "+ arr[i]);
		}

        // Closing the Scanner class object 
        sc.close(); 
	}
}