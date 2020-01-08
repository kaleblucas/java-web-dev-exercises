package exercises;

import java.util.ArrayList;

import static exercises.RandomGenerator.randomString;

public class ArrayListPractice {
    public static void main(String[] args) {
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
        System.out.println(randomString());
    }
}
