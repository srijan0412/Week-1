import java.util.Scanner;

class Handshakes {
    // Function defination
    public int calculateHandshakes(int numberOfStudents) {
        // Calculating handshakes 
        int totalHandshakes = (numberOfStudents * (numberOfStudents-1) / 2);

        return totalHandshakes;
    }
    
    public static void main(String[] args) {
        // Defining Scanner class object and SimpleInterest class object 
        Scanner sc = new Scanner(System.in);
        Handshakes obj = new Handshakes();

        // Taking numberOfStudents as input from the user 
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calling calculateHandshakes function
        int totalHandshakes = obj.calculateHandshakes(numberOfStudents);

        // output 
        System.out.println("The total number of handshakes are " + totalHandshakes);

        // Closing the scanner object
        sc.close();
    }
}
