package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import static exercises.RandomGenerator.randomString;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        do {
            numberList.add(RandomGenerator.generateInt(100));
        } while (numberList.size() < 10);
        System.out.println(numberList);
        int sum = 0;
        for (int i : numberList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the equal numbers in numberList is: " + sum);
        System.out.println("\n\n100 random strings will be generated using the alphabet.\nPlease enter the length of a string you'd like to search for, no greater than 10: ");
        int searchLength = input.nextInt();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> searchList = new ArrayList<>();
        if (searchLength > 0 && searchLength < 10) {
            for (int i = 0; i < 100; i++) {
                stringList.add(randomString(10));
            }
            for (String s: stringList){
                if (s.length() == searchLength){
                    searchList.add(s);
                }
            }
            if (searchList.size() == 0){
                System.out.println("No results found.");
            } else {
                System.out.println("Out of 100 strings, there are " + searchList.size() + " random strings with " + searchLength + " letters: " + searchList);
            }
        } else {
            System.out.println("Invalid input, please enter a number less than 10 and greater than 0.");
            searchLength = input.nextInt();
        }
//        System.out.println(stringList);
    }
}
