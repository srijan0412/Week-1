class LengthOfString {
    //Method to find the length of a string
    public static int stringLength(String str) {
        char array[] = str.toCharArray();
        int length = 0;

        for (char itr : array) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        // Defining a test-string 
        String testString = "This is a test string";
        
        // Calling the user defined method to find the length of the string 
        int length = LengthOfString.stringLength(testString);

        // Output 
        System.out.println("The length of the string is " + length);
    }
}
