package exercises;

import java.util.ArrayList;

public class RandomGenerator {
    public static int generateInt(int maxNumber){
        double randomDouble = Math.floor(Math.random()*maxNumber);
        int randomInteger = (int)randomDouble;
        return randomInteger;
    }
    public static String randomLetter(){
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        double randomAlphabetIndexDouble = Math.floor(Math.random()*alphabet.length);
        int randomAlphabetIndex = (int)randomAlphabetIndexDouble;
        return alphabet[randomAlphabetIndex];
    }
    public static String randomString(int maxLength){
        ArrayList<String> randomStringArray = new ArrayList<>();
        String randomString = "";
        for (int i=0; i < generateInt(maxLength); i++){
            randomStringArray.add(randomLetter());
        }
        for (String s : randomStringArray){
            randomString += s;
        }
        return randomString;
    }
}
