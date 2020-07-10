package com.company.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // we are assuming that the last index a[4]=1 will start to get sorted first

        int[] arrInput = {5, 4, 3, 2, 1};
        int arrLen = arrInput.length ;

        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen - i-1; j++) {
                if (arrInput[j] > arrInput[j+1]) {
                    swap(arrInput, j, j+1 );
                }
            }
        }

        System.out.println("sorted array is ");
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " ");
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
