import java.util.Scanner;

class CharArray {
    // user defined method to get char array out of a given string.
    public static char[] getCharArray(String string) {
        int stringSize = string.length();
        char charArray[] = new char[stringSize];
        
        for (int i = 0; i < stringSize; i++) {
            charArray[i] = string.charAt(i);
        }

        return charArray;
    }

    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user 
        System.out.print("Enter a string: ");
        String stringInput = sc.next();
		int stringSize = stringInput.length();
      
        //Getting char - Array with user-defined function and 
        char charArray1[] = stringInput.toCharArray();
        char charArray2[] = CharArray.getCharArray(stringInput);
		
        // Output 
        for (int i = 0; i < stringSize; i++) {
            System.out.print(charArray1[i] + " ");
        }
        System.out.println();


		//Comparing both the arrays 
		for (int i = 0; i < stringSize; i++) {
			if (charArray1[i] != charArray2[i]) {
				System.out.println("Both the char-arrays are un-equal");
                sc.close();
				return;
			}
		}
		System.out.println("Both the arrays are equal");
		
		//Closing the scanner object 
		sc.close();
    }
}
