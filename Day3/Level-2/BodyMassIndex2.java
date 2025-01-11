import java.util.Scanner;

class BodyMassIndex2 {
    public static void main(String[] args){
        // Initializing the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the number of employees: ");
        int numberOfPersons = sc.nextInt();

        // Initializing the Arrays 
        double personData[][] = new double[numberOfPersons][2];
        String weightStatus[] = new String[numberOfPersons];
        double bmi[] = new double[numberOfPersons];

        // Taking heights and weights of the people from the user
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the height(in meter) of " + i + "th person: ");
            personData[i][0] = sc.nextDouble();
            
            System.out.print("Enter the weight(in kg) of " + i + "th person: ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculating the BMI and assigning the Weight - Status
        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Under-weight";
            }
            else if (bmi[i] >= 18.5  && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi[i] >= 25 && bmi[i] <= 39.9) {
                weightStatus[i] = "Over-weight";
            }
            else if (bmi[i] >= 40) {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the BMI 
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("The person " + i + " is " + weightStatus[i]);
        }

        // Closing the scanner object 
        sc.close();
    }
}
