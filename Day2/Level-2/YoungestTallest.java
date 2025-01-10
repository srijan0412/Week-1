import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner scanner = new Scanner(System.in);

        // Taking height and age as input from the user
        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        double anthonyHeight = scanner.nextDouble();

        // Calculating the minimum age 
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        // output 
        System.out.println("Youngest Friend's Age: " + youngestAge);
        System.out.println("Tallest Friend's Height: " + tallestHeight);
        scanner.close();
    }
}
