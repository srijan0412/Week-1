import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input number
        System.out.print("Enter an integer to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        //Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}