import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        // Initializing the Scanner class object 
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        // Finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display results
        System.out.println("The youngest friend is: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
        
        // Closeing the scanner object
        scanner.close();
    }
}