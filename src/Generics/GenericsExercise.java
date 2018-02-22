package Generics;

import java.util.ArrayList;

public class GenericsExercise {

    public static void main(String[] args) {
        // Example doesn't use generics
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        // items.add("David");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
