import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the counter as input from the user
        System.out.print("Enter the Count-down number: ");
        int counter = scanner.nextInt();

        // Count-down and updating the counter 
        while (counter >= 1){
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket-Launch");
        
        scanner.close();
    }
}
