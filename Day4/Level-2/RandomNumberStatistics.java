import java.util.Random;

public class RandomNumberStatistics {
    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (1000 to 9999)
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }

        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number; // Calculate sum
            min = Math.min(min, number); // Find minimum
            max = Math.max(max, number); // Find maximum
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumberStatistics stats = new RandomNumberStatistics();

        // Generate 5 random 4-digit numbers
        int randomNumbers[] = stats.generate4DigitRandomArray(5);

        // Find average, min, and max values
        double results[] = stats.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated Random 4-Digit Numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}