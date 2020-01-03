package exercises;

import java.util.Scanner;

public class MilesPerGallonCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance travelled (miles).");
        double distance = input.nextDouble();
        System.out.println("Please enter the fuel consumed (gallons).");
        double fuelUsed = input.nextDouble();
        System.out.println("You are driving at a rate of " + distance/fuelUsed + " miles per gallon.");
    }
}
