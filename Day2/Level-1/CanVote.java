import java.util.Scanner;

class CanVote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the age as input from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean canVote = false;

        // Checking if the age of the user is legal to vote
        if (age >= 18) {
            canVote = true;
        }
        
        // printing the output
        if (canVote) {
            System.out.println("The person's age is " + age + " and can vote.");
        }
        else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        scanner.close();
    }
}
