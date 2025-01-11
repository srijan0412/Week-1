import java.util.Scanner;

class BodyMassIndex {
    public static void main(String[] args){
        // Initializing the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the number of employees: ");
        int numberOfPersons = sc.nextInt();

        // Initializing the Arrays 
        double weight[] = new double[numberOfPersons];
        double height[] = new double[numberOfPersons];
        double bmi[] = new double[numberOfPersons];

        // Taking heights and weights of the people from the user
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight(in kg) of " + i + "th person: ");
            weight[i] = sc.nextDouble();
            
            System.out.print("Enter the height(in meter) of " + i + "th person: ");
            height[i] = sc.nextDouble();
        }

        // Calculating the BMI 
        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        // Displaying the BMI 
        for (int i = 0; i < numberOfPersons; i++) {
            if (bmi[i] <= 18.4) {
                System.out.println("The person " + i + " is Under-weight.");
            }
            else if (bmi[i] >= 18.5  && bmi[i] <= 24.9) {
                System.out.println("The person " + i + " is Normal.");
            }
            else if (bmi[i] >= 25 && bmi[i] <= 39.9) {
                System.out.println("The person " + i + " is Over-weight.");
            }
            else if (bmi[i] >= 40) {
                System.out.println("The person " + i + " is Obese.");
            }
        }

        // Closing the scanner object 
        sc.close();
    }
}
