import java.lang.Math;

//Utility class 
class NumberChecker {
    // Method to calculate the count of digits in a number 
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store all the digits of a number to an array
    public static int[] storeDigits(int number) {
        // Calling the previous defined function to calculate the number of digits 
        int digitCount = countDigits(number);
        int digits[] = new int[digitCount]; //difining an empty digits array to store digits
        int index = 0;

        // Fectching out the last digit and saving it in the digits array
        while (number > 0) {
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            index ++;
            number /= 10;
        }
        
        return digits;
    }

    // Method to check if a number is a duck number 
    public static boolean isDuck(int number) {
        int digits[] = storeDigits(number); 
        int digitCount = digits.length;

        for (int i = 0; i < digitCount; i++) {
            if (digits[i] == 0) { // if digits array contain any 0, its a duck number
                return true;
            }
        }

        return false;
    }

    //Method to check if the given number is armstrong number
    public static boolean isArmstrong(int number) {
        int digits[] = storeDigits(number); //getting digits array out of number 
        int digitCount = digits.length;
        int calculatedNumber = 0;

        // Calculating the possible armstrong number 
        for (int i = 0; i < digitCount; i++) { 
            calculatedNumber = (int)Math.pow(digits[i], digitCount);
        }

        if (calculatedNumber == number) {
            return true;
        }
        return false;
    }

    // Method to find Largest and second largest digit in a number
    public static int[] findLargestAndSecondLargest(int number) {
        int digits[] = storeDigits(number);
        int digitsCount = digits.length;
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digitsCount; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }
        
        int result[] = {largest, secondLargest};
        return result;
    }

    // Method to find smallest and second Smallest digit in a number
    public static int[] findSmallestAndSecondSmallest(int number) {
        int digits[] = storeDigits(number);
        int digitsCount = digits.length;
        
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digitsCount; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            }
            else if (digits[i] < secondSmallest) {
                secondSmallest = digits[i];
            }
        }
        
        int result[] = {smallest, secondSmallest};
        return result;
    }

    // Method to find the sum of all the digits in a number
    public static int sumOfDigits(int number){
        int digits[] = storeDigits(number);
        int digitCount = digits.length;
        
        // Calculating the sum 
        int sum = 0;
        for (int i = 0; i < digitCount; i++) {
            sum += digits[i];
        }

        // returning the sum 
        return sum ;
    }

    // Method to find the sum of square of the digits in the number 
    public static int sumOfSquaresOfDigits(int number) {
        int digits[] = storeDigits(number);
        int digitCount = digits.length;
        int sum = 0;
        for (int i = 0; i < digitCount; i++){
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    } 

    // Method to check id the number is a harshad number 
    public static boolean isHarshad(int number) {
		int digits[] = storeDigits(number);
        int digitCount = digits.length;
        int originalNumber = number;
        
        // finding the sum 
        int sum = 0;
        for (int i = 0; i < digitCount; i++){
            sum += digits[i];
        }
		
        //Output
        if (originalNumber % sum == 0) {
            return true;
        } 
        return false;
    }

    // Method to find the frequency of the digits in a number
    public static int[][] findDigitFrequency(int number) {
        // Create a 2D array to store digit and frequency
        int[][] frequencyArray = new int[10][2];

        // Initialize the first column with digits 0-9
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i; // Digit
            frequencyArray[i][1] = 0; // Frequency
        }

        // Convert the number to a string to iterate through each digit
        String numberStr = Integer.toString(Math.abs(number));

        // Count the frequency of each digit
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            frequencyArray[digit][1]++; 
        }

        return frequencyArray;
    }


    public static void main(String[] args) {
        int number = 2457;

        // Testing the functions :
        int countDigits = NumberChecker.countDigits(number);
        int digits[] = NumberChecker.storeDigits(number);
        boolean isDuck = NumberChecker.isDuck(number);
        boolean isArmstrong = NumberChecker.isArmstrong(number);
        int largestAndSecondLargest[] = NumberChecker.findLargestAndSecondLargest(number);
        int smallestAndSecondSmallest[] = NumberChecker.findSmallestAndSecondSmallest(number);
        int sumOfDigits = NumberChecker.sumOfDigits(number);
        int sumOfSquareOfDigits = NumberChecker.sumOfSquaresOfDigits(number);
        boolean isHarshad = NumberChecker.isHarshad(number);
        int frequency[][] = NumberChecker.findDigitFrequency(number);

        
        // Showing output 
        System.out.println("The number is : " + number);
        System.out.println("The count of the digits in the number is : " + countDigits);
        System.out.println("The digit array is - ");
        for (int i = 0; i < countDigits; i++) {
            System.out.print(" " + digits[i]);
        }
        System.out.println();
        System.out.println("Is is a duck number: " + isDuck);
        System.out.println("Is is a Armstrong number: " + isArmstrong);
        System.out.println("Largest number is " + largestAndSecondLargest[0] + " and second largest number is " + largestAndSecondLargest[1]);
        System.out.println("Smallest number is " + smallestAndSecondSmallest[0] + " and second Smallest number is " + smallestAndSecondSmallest[1]);
        
        System.out.println("Sum of the digits: " + sumOfDigits);
        System.out.println("Sum of square of the digits: " + sumOfSquareOfDigits);
        System.out.println("Is is a Harshad number: " + isHarshad);
        System.out.println("Frequency of the digits : ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + " : " + frequency[i][1]);
            }
        }
    }
}
