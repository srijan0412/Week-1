import java.util.Scanner;

class PerimeterOfSquare {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking the side of the square as input from the user; 
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculating the perimeter of the square
        double perimeter = 4 * side;

        System.out.println("The perimeter of the square is " + perimeter + " whose side is " + side);
        input.close();

    }
}

