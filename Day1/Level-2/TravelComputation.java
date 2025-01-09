import java.util.Scanner;

class TravelComputation {
   public static void main(String[] args) {

      //Initializing the Scanner object
      Scanner scanner = new Scanner(System.in);

      //Taking the inputs from the user
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();

      System.out.print("Enter from city: ");
      String fromCity = scanner.nextLine();
   
      System.out.print("Enter via city: ");
      String viaCity = scanner.nextLine();
   
      System.out.print("Enter to city: ");
      String toCity = scanner.nextLine();
      
      System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
      double fromToVia = scanner.nextDouble();
      
      System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
      double viaToFinalCity = scanner.nextDouble();

      System.out.print("Enter time taken in hours: ");
      double timeTaken = scanner.nextDouble();

      // Calculating total distance and average speed
      double totalDistance = fromToVia + viaToFinalCity;
      double averageSpeed = totalDistance / timeTaken;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + timeTaken + " hours");
      scanner.close();
   }
}
