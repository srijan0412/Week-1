// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

class CalculateDistance {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the Distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Calculating the distance in yards and miles 
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;


        System.out.println("The distance in yards is " + distanceInYards + " and the distance in Miles is " + distanceInMiles);
        input.close();

    }
}
