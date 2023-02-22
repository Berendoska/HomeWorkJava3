package org.example;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.min;

public class MaxMin {

    public static void main(String[] args) {


        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);


        for (int i = 0; i < 10; i++)
            list.add(rand.nextInt(100));
        System.out.println("Массив" + list);

        int min = min(list);
        int max = 0;
        int sum = 0;
        int count = 0;


        for (int i = 0; i < list.size(); i++)
            if (list.get(i) > max)
                max = list.get(i);

        for (Integer i : list) {
            sum += i;
            count++;
        }


        double average = (double) sum / count;


        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
        System.out.println("Среднее арифмитическое: " + average);

    }


}














