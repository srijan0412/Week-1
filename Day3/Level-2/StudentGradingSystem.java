import java.util.Scanner;

class StudentGradingSystem {
    public static void main(String[] args){
        // Initializing the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the number of Students: ");
        int numberOfStudents = sc.nextInt();

        // Initializing the Arrays 
        double physicsMarks[] = new double[numberOfStudents];
        double chemistryMarks[] = new double[numberOfStudents];
        double mathsMarks[] = new double[numberOfStudents];
        char grades[] = new char[numberOfStudents];

        // Taking heights and weights of the people from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the physics marks of " + i + "th student: ");
            physicsMarks[i] = sc.nextDouble();
            
            System.out.print("Enter the chemistry marks of " + i + "th student: ");
            chemistryMarks[i] = sc.nextDouble();
            
            System.out.print("Enter the maths marks of " + i + "th student: ");
            mathsMarks[i] = sc.nextDouble();
        }

        // Calculating the Percentage and grading them accordingly
        for (int i = 0; i < numberOfStudents; i++) {
            double Percentage = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;

            if (Percentage >= 80) {
                grades[i] = 'A';
            }
            else if (Percentage < 80 && Percentage >= 70) {
                grades[i] = 'B';
            }
            else if (Percentage < 70 && Percentage >= 60) {
                grades[i] = 'C';
            }
            else if (Percentage < 60 && Percentage >= 50) {
                grades[i] = 'D';
            }
            else if (Percentage < 50 && Percentage >= 40) {
                grades[i] = 'E';
            }
            else {
                grades[i] = 'R';
            }
        }

        // Displaying the Results
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("The student " + i + " has aquired " + grades[i] + " Grade.");
        }

        // Closing the scanner object 
        sc.close();
    }
}
