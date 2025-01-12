import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate age for negative number
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Array to hold ages of 10 students
        int[] ages = new int[10];

        // Loop to take user input for ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check if each student can vote and display the result
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = voteChecker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
