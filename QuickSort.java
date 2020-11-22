package com.company.sorting;

public class QuickSort {
    public static void main(String args[]) {
        int[] inputArr = {20, 35, -15, 7, 55, 1, -22};

        //call quicksort
        quickSort(inputArr, 0, inputArr.length - 1);

        for (int element : inputArr) {
            System.out.print(element + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = swapTemp;

        return i + 1;
    }
}