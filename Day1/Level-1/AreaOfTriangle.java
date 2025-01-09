import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking height and base as input from the user
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Calculating the area of the triangle
        double areaInInches = base * height / 2;
        double areaInCentimeters = areaInInches * 2.54 * 2.54;

        System.out.println("The area of the triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCentimeters);
        input.close();

    }
}
