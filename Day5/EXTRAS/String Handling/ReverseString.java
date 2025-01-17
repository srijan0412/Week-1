class ReverseString {
    public static void  main(String[] args) {
        // Sample string for reversal
        String sampleString = "Here is a sample string!";
        
        // Storing sampleString to reversedString in a reverse order 
        String reversedString = "";
        for (int i = sampleString.length()-2; i >= 0; i--) {
            reversedString += sampleString.charAt(i);
        }

        // Output 
        System.out.println("The string in reverse order is : " + reversedString);
    }   
}
