import java.util.Scanner;

class LargestAndSecondLargest2 {
    public static void main(String[] args){
        // Initializing the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Taking the number as input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing the Digits array
        int maxDigits = 10;
        int digits[] = new int[maxDigits];
        
        // Extracting digits from the number and saving it to the digits array
        int index = 0;
        while (number > 0){
            int remainder = number  %  10;
            digits[index] = remainder;
            index++;
            number /= 10;

            if (index == maxDigits) { 
                // Doubling the size of maxDigits
                maxDigits = 2 * maxDigits;

                //Initializing a new temp-Array of size maxdigits 
                //Copying all the elements from digits to temp-array
                int tempDigits[] = new int[maxDigits];
                for (int i=0; i<index; i++){
                    tempDigits[i] = digits[i];
                }

                // Assigning the digits array to tempDigits 
                digits = tempDigits;
            };
        }

        // Iterating throught the digits array and finding the minimum and the maximum
        int largest = 0, secondLargest = 0;
        for (int i=0; i<index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }
        
        // Output 
        System.out.println("The largest number is " + largest + " and the second largest number is " + secondLargest);
        sc.close();
    }       
}
