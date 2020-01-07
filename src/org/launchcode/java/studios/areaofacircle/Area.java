package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a radius:");
        String radiusInput = input.nextLine();
        while (!Validation.validateRadius(radiusInput)) {
            System.out.println(radiusInput + " is not a valid radius.");
            System.out.println("Please, enter a valid radius:");
            radiusInput = input.nextLine();
        }
        double radius = Double.parseDouble(radiusInput);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
