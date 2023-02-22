package org.example;

import java.util.ArrayList;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);


        for (int i = 0; i < 10; i++)
            list.add(rand.nextInt(100));
        System.out.println("Массив" + list);

        int i = 0;

        while (i < list.size()) {

            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;

            }

        }
        System.out.println("Массив без четных чисел " + list);
    }
}

