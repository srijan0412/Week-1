import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salaries and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numberOfEmployees][2]; // [][0] = salary, [][1] = years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate a random salary between 30000 and 80000
            employeeData[i][0] = 30000 + (random.nextDouble() * 50000);
            // Generate random years of service between 1 and 20
            employeeData[i][1] = 1 + random.nextInt(20);
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [][0] = old salary, [][1] = new salary, [][2] = bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus in the updated data array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        return updatedData;
    }

    // Method to calculate sums and display in tabular format
    public static void displayResults(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s%n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            double yearsOfService = (i < updatedData.length) ? (oldSalary * 0.02 < bonus ? 1 : 0) : 0; // Dummy value for years of service

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.0f%n", oldSalary, newSalary, bonus, yearsOfService);
        }

        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f%n", totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Display results
        displayResults(updatedData);
    }
}