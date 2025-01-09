import java.util.Scanner;

class CalculatePrice {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the unitPrice: ");
        int unitPrice = input.nextInt();
        
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculating the total price
        int totalPrice = (unitPrice * quantity);


        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity +" and unit price is INR " + unitPrice);
        input.close();

    }
}
