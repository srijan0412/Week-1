import java.util.Scanner;

class Handshakes {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the Number of students: ");
        int numberOfStudents = input.nextInt();
        

        // Calculating the total maximum handshakes
        int totalHandshakes = (numberOfStudents * (numberOfStudents -1))/2;


        System.out.println("The maximum number of handshakes possible are " + totalHandshakes);
        input.close();

    }
}


