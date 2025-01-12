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

    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(square);

        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = sumOfDigits(number);
        int product = 1;
        
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String squareStr = Integer.toString(square);
        String numberStr = Integer.toString(number);

        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        // Counting the factors 
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        //Find the factors and adding it to the factors array
        int factors[] = new int[factorCount];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[idx] = i;
                idx++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int factors[] = findFactors(number);
        return factors[factors.length - 1]; // The last element is the greatest factor
    }

    // Method to find the sum of the factors using factors array and return the sum
    public static int sumOfFactors(int number) {
        int factors[] = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

     // Method to find the product of the factors using factors array and return the product
    public static int productOfFactors(int number) {
        int factors[] = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int factors[] = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
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
        System.out.println("Is it a prime number? " + isPrime(number));
        System.out.println("Is it a neon number? " + isNeon(number));
        System.out.println("Is it a spy number? " + isSpy(number));
        System.out.println("Is it an automorphic number? " + isAutomorphic(number));
        System.out.println("Is it a buzz number? " + isBuzz(number));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfect(number));
        System.out.println("Is Abundant Number: " + isAbundant(number));
        System.out.println("Is Deficient Number: " + isDeficient(number));
        System.out.println("Is Strong Number: " + isStrong(number));
    }
}
