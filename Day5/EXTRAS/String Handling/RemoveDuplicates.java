public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String str) {
        // Create a boolean array to track seen characters
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the character has not been seen before, add it to the result
            if (!seen[c]) {
                seen[c] = true; // Mark this character as seen
                result += c; // Append the character to the result
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test string 
        String input = "programming";
        
        //Result calculation 
        String result = removeDuplicateCharacters(input);
        
        // Output 
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}