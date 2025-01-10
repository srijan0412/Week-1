import java.util.Scanner;

class MarksEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking marks from the User
        System.out.print("Enter Marks in Physics: ");
		double marksPhysics = scanner.nextDouble();
		
		System.out.print("Enter Marks in Chemistry: ");
		double marksChemistry = scanner.nextDouble();
		
		System.out.print("Enter Marks in Maths: ");
		double marksMaths = scanner.nextDouble();
		
        // Calculating percentage
		double percentage = (marksPhysics + marksChemistry + marksMaths)/3;

        char grade;
        if (percentage >= 80.0){
            grade = 'A';
        }
        else if (percentage < 80.0 && percentage >= 70) {
            grade = 'B';
        }
        else if (percentage < 70 && percentage >= 60) {
            grade = 'C';
        }
        else if (percentage < 60 && percentage >= 50) {
            grade = 'D';
        }
        else if (percentage < 50 && percentage >= 40) {
            grade = 'E';
        }
        else {
            grade = 'R';
        }

        System.out.println("The Student had scored " + percentage + "% and Aquired " + grade + " Grade.");
        scanner.close();
    }
}
