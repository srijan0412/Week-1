class NullPointerExceptionDemo {
    // getNullPointerError() is a function that causes a NullPointerException
    public static void getNullPointerError() {
        // Defining a null varialble to test the Null pointer exception 
        String testString = null;
    
        // The  below line will generate a null pointer exception
        System.out.println(testString.length());
    }

    public static void main(String[] args) {
        // Trying to catch and manage the error 
        try {
            NullPointerExceptionDemo.getNullPointerError();
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception " + e.getMessage());
        }
    }    
}
