package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, \n" +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, \n" +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice \n" +
                "'without pictures or conversation?'\n";
        System.out.println(aliceText);
        System.out.println("Please, enter a term found in the first sentence of Alice's Adventures in Wonderland:");
        String searchTerm = input.nextLine();
        int searchTermIndex = aliceText.toLowerCase().indexOf(searchTerm.toLowerCase());
        System.out.println(searchTermIndex);
//        String aliceTextModified = aliceText.replace(searchTerm)
    }
}
