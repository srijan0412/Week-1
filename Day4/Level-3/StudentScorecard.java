import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Generate random scores
        int[][] scores = generateRandomScores(numberOfStudents);
        
        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);
        
        // Display scorecard
        displayScorecard(scores, results);
        
        scanner.close();
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: PCM
        
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics
            scores[i][1] = random.nextInt(90) + 10; // Chemistry
            scores[i][2] = random.nextInt(90) + 10; // Math
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][4]; // Total, Average, Percentage
        
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // Total marks are 300
            
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }
        
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("-------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n", (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
        
        System.out.println("-------------------------------------------------");
    }
}
