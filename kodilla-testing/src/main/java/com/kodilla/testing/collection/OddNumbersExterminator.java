package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator (ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        int i = numbers.size();
        while (i!=0) {
            i--;
            System.out.print("ArrayList element: " + i);
            if (numbers.get(i) % 2 != 0) {
                System.out.println(" odd number");
                numbers.remove(i);
            } else {
                System.out.println(" even number");
            }
        }
        System.out.println("arrayList size: " + " " + numbers.size());
        return numbers;
    }

    int size() {
        return numbers.size();
    }
}