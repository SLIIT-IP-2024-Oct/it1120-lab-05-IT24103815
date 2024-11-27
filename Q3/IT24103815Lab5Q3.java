import java.util.Scanner;

public class IT24103815Lab5Q3 {
    // Use Constants to declare fixed values
    public static final int roomChargePerDay = 48000;
    public static final int discountRate3To4Days = 10; 
    public static final int discountRate5OrMoreDays = 20; 
    
    public static void main(String[] args) {
        //Create an object called scanner to Scanner class
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter start 
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        // Prompt user to enter end date
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();
        
        // Validate the dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) 
          {
            System.out.println("Error: Days must be between 1 and 31.");
          scanner.close();
          return;
          }

        if (startDate >= endDate) 
          {
            System.out.println("Error: Start date must be less than the end date.");
          scanner.close();
          return;
          }
        
        // Calculate the number of days reserved
        int numberOfDaysReserved = endDate - startDate;
        
        // Determine the discount rate
        int discountRate = 0;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = discountRate3To4Days ;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = discountRate5OrMoreDays;
        }
        
        // Calculate the total amount to be paid
        int totalAmount = numberOfDaysReserved * roomChargePerDay;
        int discountAmount = (totalAmount * discountRate) / 100;
        int amountToBePaid = totalAmount - discountAmount;
        
        // Display the results
        System.out.println("\nRoom charge per day: " + roomChargePerDay);
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.println("Total amount to be paid: Rs " + amountToBePaid);
        
        // Close the scanner
        scanner.close();
    }
}
