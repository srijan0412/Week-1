import java.util.Scanner;

class FrequencyCount  {
    public static void main(String[] args) {
        // Initializing the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking number as input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Finding the number of digits in the number 
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber > 0){
            digitCount++;
            tempNumber /= 10;
        }

        //Storing the digits in an array
        int digits[] = new int[digitCount];
        int index = 0;
        while (number > 0){
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            number /= 10;
            index ++;
        }

        // Finding the frequency of each element 
        int frequencyArray[] = new int[10];
        for (int i = 0; i < digitCount; i++){
            frequencyArray[digits[i]]++;
        }

        // Printing out the frequency
        for (int i = 0; i < 10; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("The frequency of " + i + " in the number is " + frequencyArray[i]);
            }
        }

        // closing the scanner object 
        sc.close(); 
    }
}
