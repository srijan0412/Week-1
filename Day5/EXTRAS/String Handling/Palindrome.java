class Palindrome {
    // Function to check if a number id palindrone or not 
    public static boolean isPalindrone(String string) {
        int stringSize = string.length();
        for (int i = 0; i < stringSize / 2; i++) {
            if (string.charAt(i) != string.charAt(stringSize-i-1)) {
                return false;
            }
        }
        return true;
    } 
    public static void  main(String[] args) {
        // Sample string for reversal
        String sampleString1 = "abaaba";
        String sampleString2 = "bcab";
        
        // Ouput
        if (Palindrome.isPalindrone(sampleString1)) {
            System.out.println("The string " + sampleString1 + " is a palindrone string.");
        }
        else {
            System.out.println("The string " + sampleString1 + " is not a palindrone string.");
        }

        if (isPalindrone(sampleString2)) {
            System.out.println("The string " + sampleString2 + " is a palindrone string.");
        }
        else {
            System.out.println("The string " + sampleString2 + " is not a palindrone string.");
        }
    }   
}
