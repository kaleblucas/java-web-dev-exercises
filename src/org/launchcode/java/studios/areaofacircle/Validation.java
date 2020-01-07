package org.launchcode.java.studios.areaofacircle;

public class Validation {
    public static boolean isDouble(String input) {
        boolean result;
       try{
           double inputAsDouble = Double.parseDouble(input);
           result = true;
       } catch(NumberFormatException e) {
           result = false;
       }
       return result;
    }
    public static boolean validateRadius(String input) {
        if (!isDouble(input)) {
            return false;
        } else if (Double.parseDouble(input) <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
