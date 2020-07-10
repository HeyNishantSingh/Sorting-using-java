package com.company.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = a.length;

        for (int i = n - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (a[j] > a[largest]) {
                    largest = j;
                }
                swap(a, largest, i);
            }
        }

        //For output
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
