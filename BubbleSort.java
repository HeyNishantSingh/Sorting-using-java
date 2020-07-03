package com.company.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1}; // we are assuming that the last index a[4]=1 will start to get sorted first
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1 );
                }
            }
        }
        System.out.println("sorted array is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        } else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
