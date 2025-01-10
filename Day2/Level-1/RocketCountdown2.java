import java.util.Scanner;

public class RocketCountdown2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the counter as input from the user
        System.out.print("Enter the Count-down number: ");
        int counter = scanner.nextInt();

        // Count-down and printing the counter 
        for (int i=counter; i>=1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket-Launch");
        
        scanner.close();
    }
}
