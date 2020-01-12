package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class CharacterCounter {
    public static void main(String[] args){
        HashMap<String, Integer> characterHashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String textExample = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one " +
                "side, you can put the quadratics into a form that can be factored allowing that " +
                "side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        char[] charactersInStrings = textExample.toCharArray();
        System.out.println(charactersInStrings);
        System.out.println("Please, enter a word. The character count will be broken down for you:");
        String inputText = input.nextLine();
        char[] charactersInString = inputText.toCharArray();
        for (char c : charactersInString) {
            String charAsString = Character.toString(c).toLowerCase();
            int charCode = (int) charAsString.charAt(0);
            if (charCode < 97 || charCode > 122){
                continue;
            } else if (!characterHashMap.containsKey(charAsString)){
                characterHashMap.put(charAsString, 1);
            } else if (characterHashMap.containsKey(charAsString)){
                characterHashMap.compute(charAsString, (k,v) -> v+1);
            }
        }

        for (Map.Entry<String, Integer> characterList : characterHashMap.entrySet()) {
            System.out.println(characterList.getKey() + ": " + characterList.getValue());
        }

    }
}