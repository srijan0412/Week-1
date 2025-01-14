import java.util.Scanner;

class VowelConsonants {
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
    public static int[] getVowelConsonantCount(String givenString) {
        int vowelAndConsonant[] = new int[2]; 
        // the vowel count is in vowelAndConsonant[0]
        // the consonant count is in vowelAndConsonant[1]

        for (int i = 0; i < givenString.length(); i++) {
            int flag = vowelOrConsonant(givenString.charAt(i));

            if (flag == 1) {
                vowelAndConsonant[0]++;
            }
            else if (flag == -1) {
                vowelAndConsonant[1]++;
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
        int VowelConsonantCount[] = VowelConsonants.getVowelConsonantCount(testString);

        // Output 
        System.out.println("No. of Vowels are " + VowelConsonantCount[0] + " and No. of consonanats are " + VowelConsonantCount[1]);

        // Closing the scanner object 
        sc.close();
    }    
}
