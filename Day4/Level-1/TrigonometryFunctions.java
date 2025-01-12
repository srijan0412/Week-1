import java.lang.Math;
import java.util.Scanner;

public class TrigonometryFunctions {
    // Function defination 
    public double[] calculateTrigonometricFunctions(double angle) {
        // Defining the result array
        double result[] = new double[6];

        // Calculating the trigonometric functions 
        result[0] = Math.sin(angle);
        result[1] = Math.cos(angle);
        result[2] = Math.tan(angle);
        result[3] = Math.asin(angle);
        result[4] = Math.acos(angle);
        result[5] = Math.atan(angle);
        

        return result;
    }
    
    public static void main(String[] args){
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        TrigonometryFunctions obj = new TrigonometryFunctions();
    
        // Taking angle as input from the user 
        System.out.print("Enter the angle: ");
        double angle = sc.nextInt();

        // Calling the function 
        double result[] = obj.calculateTrigonometricFunctions(angle);
        
        // Output 
        System.out.println("The trigonometric-sine of the given angle is " + result[0]);
        System.out.println("The trigonometric-cosine of the given angle is " + result[1]);
        System.out.println("The trigonometric-Tangenet of the given angle is " + result[2]);
        System.out.println("The trigonometric-Arc-sine of the given angle is " + result[3]);
        System.out.println("The trigonometric-Arc-cosine of the given angle is " + result[4]);
        System.out.println("The trigonometric-Arc-Tangenet of the given angle is " + result[5]);
        
        // Closing the scanner class object 
        sc.close();
    }
}
