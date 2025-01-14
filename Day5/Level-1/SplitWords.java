import java.util.Scanner;
import java.lang.String;

class SplitWords {
    //Method to find the length of a string
    public static int stringLength(String str) {
        char array[] = str.toCharArray();
        int length = 0;

        for (char itr : array) {
            length++;
        }

        return length;
    }

    //Program to split a words in a line
    public static String[] splitWords(String mainString) {
        int mainStringLength = stringLength(mainString);

        // count words 
        int spaceCount = 0;
        for (int i = 0; i < mainStringLength; i++) {
            if (mainString.charAt(i) == ' ') spaceCount++;
        }
        int wordCount = spaceCount + 1;
        
        //spliting the array
        String result[] = new String[wordCount];
        int idx = 0;
        String tempString = "";
        for (int i = 0; i < mainStringLength; i++) {
            if (mainString.charAt(i) != ' '){
                tempString += mainString.charAt(i);
            }
            else {
                result[idx] = tempString;
                tempString = "";
                idx++;
            }
        }
        result[idx] = tempString;

        // Returning the array of strings 
        return result;
    }

    // Method to create a word length array (2D Array)
    public static String[][] createWordLengthArray(String stringArray[]) {
        int stringArrayLength = stringArray.length;
        String wordLengthArray[][] = new String[stringArrayLength][2];
        
        for (int i = 0; i < stringArrayLength; i++) {
            wordLengthArray[i][0] = stringArray[i];
            wordLengthArray[i][1] = String.valueOf(stringLength(stringArray[i]));
        }

        return wordLengthArray;
    }
    
    public static void main(String[] args) {
        //Defining a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the String: ");
        String testString = sc.nextLine();

        // Converting to string array 
        String stringArray[] = SplitWords.splitWords(testString);

        // Converting to 2D string array
        String stringArray2D[][] = SplitWords.createWordLengthArray(stringArray);

        // Output 
        for (int i = 0; i < stringArray2D.length; i++) {
            System.out.println(stringArray2D[i][0] + " length : " + stringArray2D[i][1]);
        }

        //closing the scanner object
        sc.close();
    }
}
