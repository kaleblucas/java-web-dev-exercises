package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //step one
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        //step two
        for (int i : numbersArray) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        //step 3
        String drSeussQuote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] drSeussQuoteArray = drSeussQuote.split(" ");
        System.out.println(Arrays.toString(drSeussQuoteArray));
        drSeussQuoteArray = drSeussQuote.split("\\.");
        System.out.println(Arrays.toString(drSeussQuoteArray));
    }
}
