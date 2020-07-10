package com.company.sorting;

public class recursiveInsertionSort {
    public static void main(String args[]) {

        int[] elements = {5, 4, 3, 2, 1};
        insertionSort(elements, elements.length);

        // for output
        for (int i : elements) {
            System.out.print(i + " ");

        }
    }

    private static void insertionSort(int[] a, int n) {
        if (n < 2)
            return;
        insertionSort(a, n - 1);

        int i, newElement = a[n - 1]; //as n-1 is the last element which has not been sorted

        for (i = n - 1; i > 0 && newElement < a[i - 1]; i--) {
            a[i] = a[i - 1];

        }
        a[i] = newElement;
    }
}
