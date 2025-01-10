import java.util.Scanner;

class MultiplicationTable{
	public static void main(String [] args){
		//Initializing a Scanner class object 
		Scanner sc = new Scanner(System.in);
		
		//Defining an array of size 10
		int arr [] = new int[10];
		
		//Taking input from the user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		//Storing multiplication of number in array
		for(int i=0; i<10; i++){
			arr[i] = number * (i+1);
			System.out .println(number+" * "+ (i+1) + " = "+ arr[i]);
		}

        // closing the scanner object 
        sc.close();
	}
}