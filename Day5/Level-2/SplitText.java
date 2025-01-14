class SplitText {
    // Function to split a text into an array of words 
    public static String[] splitText(String mainString){
        int mainStringLength = mainString.length();

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
    public static void main(String[] args) {
        //Sample text for testing
        String sampleText = "This is a random text";

        // Splitting the text into words 
        String stringArray[] = SplitText.splitText(sampleText);

        // Output 
        System.out.println("This is the resulted array of words -");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " , ");
        }
    }
}
