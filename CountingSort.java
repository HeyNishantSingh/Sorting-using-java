package com.company.sorting;

public class CountingSort {
    public static void main(String args[]) {
        int[] arrInp = {1, 2, 1, 3, 2, 4, 5, 5};
        int max = arrInp[0], min = arrInp[0];

        /* note this is done if user himself
           does not enter the value of max and min */
        for (int i = 1; i < arrInp.length; i++) {
            if (arrInp[i] > max) {
                max = arrInp[i];
            } else if (arrInp[i] < min) {
                min = arrInp[i];
            }

        }
        countingSort(arrInp, min, max);

        System.out.print("the sorted array is \n");
        for (int element : arrInp) {
            System.out.print(element + " ");
        }
    }

    public static void countingSort(int inputArr[], int min, int max) {
        int[] tempArr = new int[(max - min) + 1];

        // to assign the counting array to count the no of occurrences of each element
        for (int i = 0; i < inputArr.length; i++) {
            tempArr[inputArr[i] - min]++;
        }

        int j = 0;
        //as the complete inputArr and tempArr will be between min and max element
        for (int i = min; i < max; i++) {
            while (tempArr[i - min] > 0) {
                inputArr[j++] = i;
                tempArr[i - min]--;
            }
        }
    }
}
