import java.util.Scanner;

public class SimpleInterest {

    // SI function Defination
    public double calculateSimpleInterest(int principal, int rate, int time) {
        // Calculating SI 
        int simpleInterst = (principal * rate * time) / 100;

        return simpleInterst;
    }
    public static void main(String[] args) {
        // Defining Scanner class object and SimpleInterest class object 
        Scanner sc = new Scanner(System.in);
        SimpleInterest obj = new SimpleInterest();

        // Taking principal, rate & time as input from the user 
        System.out.print("Enter principal: ");
        int principal = sc.nextInt();
        
        System.out.print("Enter Rates: ");
        int rate = sc.nextInt();
        
        System.out.print("Enter Time: ");
        int time = sc.nextInt();

        // Calling the function 
        double simpleInterest = obj.calculateSimpleInterest(principal, rate, time);

        // output 
        System.out.println("the Simple Interest is " + simpleInterest);

        // Closing the scanner class object 
        sc.close();
    }
}
