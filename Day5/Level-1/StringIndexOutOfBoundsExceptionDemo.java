class StringIndexOutOfBoundsExceptionDemo {
    // getNullPointerError() is a function that causes a String Index Out Of Bound exception 
    public static void getStringIndexOutOfBoundsException() {
        // Defining a variable to test the String index out of bound exception  
        String testString = "Hello";
    
        // The below line will generate a String index out of bound exception  
        System.out.println(testString.charAt(5));
    }

    public static void main(String[] args) {
        // Trying to catch and manage the error 
        try {
            StringIndexOutOfBoundsExceptionDemo.getStringIndexOutOfBoundsException();
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception - " + e.getMessage());
        }
    }    
}
