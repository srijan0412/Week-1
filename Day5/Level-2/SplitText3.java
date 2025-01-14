import java.util.Scanner;

class SplitText3 {
    // Program to find the shortest and the largest string in the String array 
    public static String[] findShortestAndLargest(String[] stringArray) {
        int arraySize = stringArray.length;
        String largestSmallest[] = new String[2];
        largestSmallest[0] = stringArray[0]; //Initializing the largest element as the first element in the array
        largestSmallest[1] = stringArray[0]; //Initializing the Smallest element as the first element in the array
        
        for (int i = 1; i < arraySize; i++) {
            if (stringArray[i].length() > largestSmallest[0].length()) {
                largestSmallest[0] = stringArray[i];
            }
            if (stringArray[i].length() < largestSmallest[1].length()) {
                largestSmallest[1] = stringArray[i];
            }
        }
        
        return largestSmallest; //Returning the answer 
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

    //Method to find the length of a string
    public static int stringLength(String str) {
        char array[] = str.toCharArray();
        int length = 0;

        for (char itr : array) {
            length++;
        }

        return length;
    }

    // Method to create a word length array (2D Array)
    public static String[][] createWordLengthArray(String stringArray[]) {
        int stringArrayLength = stringArray.length;
        String wordLengthArray[][] = new String[stringArrayLength][2];
        
        for (int i = 0; i < stringArrayLength; i++) {
            wordLengthArray[i][0] = stringArray[i];
            wordLengthArray[i][1] = String.valueOf(stringArray[i].length());
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
        String stringArray[] = SplitText3.splitWords(testString);

        // Converting to 2D string array
        String stringArray2D[][] = SplitText3.createWordLengthArray(stringArray);

        // Finding the shortest and the longest string 
        String result[] = SplitText3.findShortestAndLargest(stringArray);

        // displaying the output
        System.out.println("The largest element is " + result[0] + " and the shortest element is " + result[1]);
        
        //closing the scanner object
        sc.close();
    }
}
