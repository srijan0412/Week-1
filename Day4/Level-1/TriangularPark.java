import java.util.Scanner;
import java.lang.Math;

class TriangularPark {
    // Function defination
    public int calculateRounds(double side1, double side2, double side3) {
        // Calculating the perimeter 
        double perimeter = side1 + side2 + side3;

        // Calculating the number of rounds
        int rounds = (int)Math.ceil((5 / perimeter));

        return rounds;
    }
    
    public static void main(String[] args) {
        // Defining Scanner class object 
        Scanner sc = new Scanner(System.in);
        TriangularPark obj = new TriangularPark();

        // Taking all the sides of the triangle as input from the user 
        System.out.print("Enter the side 1: ");
        int side1 = sc.nextInt();
        
        System.out.print("Enter the side 2: ");
        int side2 = sc.nextInt();
        
        System.out.print("Enter the side 3: ");
        int side3 = sc.nextInt();

        // Calling the calculateRounds function
        int rounds = obj.calculateRounds(side1, side2, side3);

        // output 
        System.out.println("The total number of handshakes are " + rounds);

        // Closing the scanner object
        sc.close();
    }
}

