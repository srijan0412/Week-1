class CountVowelsConsonants {
    public static void main(String[] args) {
        // Defining a sample string for testing
        String sampleString = "Here is a sample string";
        
        // Counting the vowels and Consonants 
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < sampleString.length(); i++) {
            if (sampleString.charAt(i) == 'a' || sampleString.charAt(i) == 'e' || sampleString.charAt(i) == 'i' || sampleString.charAt(i) == 'o' || sampleString.charAt(i) == 'u') {
                vowelCount++;
            }
            else if (sampleString.charAt(i) != ' ') {
                consonantCount++;
            }
        }

        // Output 
        System.out.println("The total number of vowels are " + vowelCount + " and the total number of consonants are " + consonantCount);
    }   
}
