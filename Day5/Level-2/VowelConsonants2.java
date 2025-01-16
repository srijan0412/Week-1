import java.util.Scanner;
import java.lang.String;

class VowelConsonants2 {
    // Method to check if the given character is a vowel, a consonant or not a character 
    public static int vowelOrConsonant(char givenChar) {
        // This function returns 1 for a vowel, -1 for a consonant, and 0 for not a character 
        if (givenChar == 'a' || givenChar == 'e' || givenChar == 'i' || givenChar == 'o' || givenChar == 'u') {
            return 1;
        }
        else if (givenChar != ' ') {
            return -1;
        }
        return 0;
    }

    // Method to find the number of vowels and consonants in a string 
    public static String[][] getVowelConsonantCount(String givenString) {
        String vowelAndConsonant[][] = new String[givenString.length()][2]; 
        // the vowel count is in vowelAndConsonant[0]
        // the consonant count is in vowelAndConsonant[1]

        for (int i = 0; i < givenString.length(); i++) {
            int flag = vowelOrConsonant(givenString.charAt(i));
            vowelAndConsonant[i][0] = String.valueOf(givenString.charAt(i));

            if (flag == 1) {
                vowelAndConsonant[i][1] = "vowel";
            }
            else if (Character.isAlphabetic(vowelAndConsonant[i][0].charAt(0))) {
                vowelAndConsonant[i][1] = "consonant";
            }
            else {
                vowelAndConsonant[i][i] = "Not an alphabet";
            }
        }

        return vowelAndConsonant;
    }

    public static void main(String[] args) {
        // Defining a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the string: ");
        String testString = sc.nextLine();

        // Calling the function 
        String VowelOrConsonant[][] = VowelConsonants2.getVowelConsonantCount(testString);

        // Output
        System.out.println("Char        type");
        System.out.println("----------------");
        for (int i = 0; i < VowelOrConsonant.length; i++) {
            System.out.println(VowelOrConsonant[i][0] + "     " + VowelOrConsonant[i][1]);
        }
        // Closing the scanner object 
        sc.close();
    }    
}
