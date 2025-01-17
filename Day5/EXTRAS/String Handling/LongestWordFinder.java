import java.util.Scanner;

public class LongestWordFinder {
    // Method to find the longest work in a sentence 
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longestWord = "";

        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }

        return longestWord;
    }
    public static void main(String[] args) {
        // Defining a scanner class object 
        Scanner scanner = new Scanner(System.in);

        // Taking sentence as input from the user
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Calling the findLongestWord() function 
        String longestWord = findLongestWord(sentence);

        // Output 
        System.out.println("The longest word is: " + longestWord);
        
        // Closing the scanner class object 
        scanner.close();
    }
}