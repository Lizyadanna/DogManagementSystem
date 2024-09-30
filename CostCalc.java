
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
    }
}
