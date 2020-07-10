package com.company.sorting;

public class QuickSort {
    public static void main(String args[]) {
        int[] inputArr = {20, 35, -15, 7, 55, 1, -22};
        quickSort(inputArr, 0, inputArr.length);

        for (int element : inputArr) {
            System.out.print(element + " ");
        }
    }

    private static void quickSort(int[] a, int start, int end) {
        if (end - start < 2)
            return;

        int partionIndex = partition(a, start, end);
        quickSort(a, start, partionIndex);
        quickSort(a, partionIndex + 1, end);
    }

    private static int partition(int[] a, int start, int end) {
        int i = start, j = end;
        int pivot = a[start];

        while (i < j) {
            // alternating between right to left and left to right
            while (i < j && a[--j] >= pivot) ;
            if (i < j) {
                a[j] = a[j];
            }

            while (i < j && a[++i] <= pivot) ;
            if (i < j) {
                a[j] = a[i];
            }
        }
        a[i] = pivot;
        return i;
    }
}
