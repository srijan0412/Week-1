import java.util.Scanner;

class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        
        scanner.close();
    }
}