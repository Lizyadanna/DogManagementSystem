
//Importation of Scanner class
import java.util.Scanner;

//Declaration of class named CostCalc
public class CostCalc {
    // Declaration of main method
    public static void main(String[] args) throws Exception {

        // Declaration of non-constant variables
        String dogName;
        String dogBreed;
        String dogBoardingGroup;
        int dogAge;
        int daysOfBoarding;
        int dogWeight;
        double dailyCareFee;
        double estimatedCost;
        double discountAmount;

        // Declaration and assignment of constant variables
        final double DISCOUNT = 0.02;
        final double DAILY_CARE_FEE_UNDER_15_POUNDS = 45.00;
        final double DAILY_CARE_FEE_15_TO_30_POUNDS = 65.00;
        final double DAILY_CARE_FEE_31_TO_80_POUNDS = 85.00;
        final double DAILY_CARE_FEE_OVER_80_POUNDS = 100.00;

        // Instantiating new scanner object named scnr
        Scanner scnr = new Scanner(System.in);

        // Printing a welcome message for program
        System.out.println(
                "Welcome to MPLS Dog Boarding cost calculator, this application will generate a summary of cost.");


        // Creating blank line for spacing and readability
        System.out.println();

        // Prompting user for dog information and reading user input using scanner
        System.out.print("Please enter the name of your dog: ");
        dogName = scnr.nextLine();
        System.out.print("Please enter the breed of your dog: ");
        dogBreed = scnr.nextLine();
        System.out.print("Please enter the age of your dog: ");
        dogAge = Integer.parseInt(scnr.nextLine());
        System.out.print("Please enter the number of days you will need boarding service: ");
        daysOfBoarding = Integer.parseInt(scnr.nextLine());
        System.out.print("Please enter your dog's weight in pounds: ");
        dogWeight = Integer.parseInt(scnr.nextLine());

        // Assigning daily care fee based on dog weight
        if (dogWeight < 15) {
            dailyCareFee = DAILY_CARE_FEE_UNDER_15_POUNDS;
        } else if (dogWeight >= 15 && dogWeight <= 30) {
            dailyCareFee = DAILY_CARE_FEE_15_TO_30_POUNDS;
        } else if (dogWeight >= 31 && dogWeight <= 80) {
            dailyCareFee = DAILY_CARE_FEE_31_TO_80_POUNDS;
        } else {
            dailyCareFee = DAILY_CARE_FEE_OVER_80_POUNDS;
        }

        // Calculation of estimated cost using daily care fee and days of boarding
        estimatedCost = dailyCareFee * daysOfBoarding;

        // Determination of dog's boarding group based on dog age
        if (dogAge == 0) {
            dogBoardingGroup = "Blue";
        } else if (dogAge >= 1 && dogAge <= 4) {
            dogBoardingGroup = "Orange";
        } else if (dogAge == 5) {
            dogBoardingGroup = "Red";
        } else if (dogAge >= 6 && dogAge <= 15) {
            dogBoardingGroup = "Green";
        } else {
            dogBoardingGroup = "N/A";
        }

        // Blank line for spacing and readability
        System.out.println();

        // Introduction message for summary of estimated cost
        System.out.println("SUMMARY OF ESTIMATED BOARDING COST");

        // Print a new line for spacing and readability
        System.out.println();

        // For loop for printing of dashed line for styling
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        // Moving cursor to next line
        System.out.println();

        // Printing blank line for spacing and readability
        System.out.println();

        // Printing of dog information
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog breed: " + dogBreed);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog weight: " + dogWeight);
        System.out.println("Day/(s) of boarding: " + daysOfBoarding);
        System.out.println("Daily care fee: $" + dailyCareFee);
        System.out.println("Dog boarding group: " + dogBoardingGroup);

        // Printing of blank line for spacing and readability
        System.out.println();

        // Determine eligibility for 2% discount and application of discount if true
        if (estimatedCost > 165) {
            discountAmount = estimatedCost * DISCOUNT;
            estimatedCost = estimatedCost - discountAmount;
            System.out.println("You will receive a 2% discount applied to your overall bill.");
        } else {
            System.out.println("Does not qualify for discount");
        }

        // Printing of final estimated boarding cost
        System.out.println("Your estimated boarding cost is: $" + estimatedCost);

        // Printing of blank line for spacing and readability
        System.out.println();

        // For loop for printing of dashed line for styling
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        // Move cursor to next line
        System.out.println();

        // Close scanner object
        scnr.close();
    }
}

