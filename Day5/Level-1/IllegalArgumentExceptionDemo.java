class IllegalArgumentExceptionDemo {
    // getIllegalArgumentException() is a function that causes a get Illegal Argument Exception 
    public static void getIllegalArgumentException() {
        // Defining a variable to test the get Illegal Argument Exception  
        String testString = "Hello";
    
        // The below line will generate a get Illegal Argument Exception  
        System.out.println(testString.substring(3, 2));
    }

    public static void main(String[] args) {
        // Trying to catch and manage the error 
        try {
            IllegalArgumentExceptionDemo.getIllegalArgumentException();
        }
        catch(IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception - " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Exception - " + e.getMessage());
        }
    }    
}
