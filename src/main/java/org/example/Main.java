package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 12);
        }
        System.out.println("Случайный массив" + Arrays.toString(arr));
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {

        }
        System.out.println("Отсортированный массив" + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {

        int size = arr.length;
        if (size == 1) return;
        ;
        int middle = size / 2;
        int[] left = new int[middle];
        int[] right = new int[size - middle];

        for (int i = 0; i < middle; i++)
            left[i] = arr[i];
        for (int i = 0; i < size - middle; i++)
            right[i] = arr[i + middle];

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);

    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < l && j < r) {
            if (left[i] < right[j]) {
                arr[index] = left[i];
                i++;
                index++;
            } else {
                arr[index] = right[j];
                j++;
                index++;

            }

        }
        for (int k = i; k < l; k++)
            arr[index++] = left[k];
        for (int rr = j; rr < r; rr++)
            arr[index++] = right[rr];

    }

}


