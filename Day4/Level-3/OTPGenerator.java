import java.util.HashSet;

public class OTPGenerator {
    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // If the OTP is already in the set, it's not unique
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
