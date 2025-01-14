import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {
    // getArrayIndexOutOfBoundsException() is a function that causes a ArrayIndexOutOfBoundsException
    public static void getArrayIndexOutOfBoundsException(String[] testStringArray) {
        int arraySize = testStringArray.length;
        // The  below line will generate a Array Index Out Of Bounds Exception
        System.out.println(testStringArray[arraySize+2]);
    }

    public static void main(String[] args) {
        // Defining a scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking input from ther user 
        System.out.print("Enter the length of the array: ");
        int arraySize = sc.nextInt();
        String stringArray[] = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter the array-element: ");
            stringArray[i] = sc.next();
        }

        // Trying to catch and manage the error 
        try {
            ArrayIndexOutOfBoundsExceptionDemo.getArrayIndexOutOfBoundsException(stringArray);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of the bounds Exception - " + e.getMessage());
        }

        // Closing the scanner class object 
        sc.close();
    }
}
