public class FootballTeamAnalysis {
    // method to Find the sum of all the elements present in the array.
    public static int sumOfHeights(int heights[], int n) {
        int sum = 0; // initializing sum to zero
        for (int i = 0; i < n; i++) {
            sum += heights[i];
        }
        return sum; //returing the sum 
    }

    // method to calculate mean of all the elements in an array
    public static int meanHeight(int height[], int n) {
        int sum = sumOfHeights(height, n);
        int meanHeight = sum / n;
        return meanHeight;
    }

    // Method to find the shortest elements in the array
    public static int findShorteest(int heights[], int n) {
        int smallest = 250;
        for (int i = 0; i < n; i++) {
            if (smallest > heights[i]) {
                smallest = heights[i];
            }
        }
        return smallest;
    }  

    // Method to find the largest elements in the array  
    public static int findTallest(int heights[], int n) {
        int tallest = 0;
        for (int i = 0; i < n; i++) {
            if (tallest < heights[i]) {
                tallest = heights[i];
            }
        }
        return tallest;
    }  
    public static void main(String[] args) {
        // defining the initial data
        int sizeOfTeam = 11;
        int team[] = new int[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            team[i] = 150 + (int)(Math.random() * ((250 - 150) + 1));
        }

        // Calling function 
        int shortest = FootballTeamAnalysis.findShorteest(team, sizeOfTeam);
        int tallest = FootballTeamAnalysis.findTallest(team, sizeOfTeam);
        int meanHeight = FootballTeamAnalysis.meanHeight(team, sizeOfTeam);

        // Displaying the output
        System.out.println("The Shortest height among all is " + shortest);
        System.out.println("The Tallest height among all is " + tallest);
        System.out.println("The mean height of the team is " + meanHeight);
    }
}
