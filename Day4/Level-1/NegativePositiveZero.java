import java.util.Scanner;

class NegativePositiveZero {
    // function defination 
    public int checkStatus(int number) {
        if (number > 0) {   
            return 1;
        }
        else if (number < 0) {
            return -1;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        NegativePositiveZero obj = new NegativePositiveZero();

        // Taking number as input from the user 
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Calling the checkStatus function 
        int status = obj.checkStatus(number);

        // Displaying the output 
        if (status == 1) {
            System.out.println("The number is positive.");
        }
        else if (status == -1) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }

        // Closing the scanner class object 
        sc.close();
    }
}
