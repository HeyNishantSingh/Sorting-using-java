package com.company.Sorting;

public class CountingSort {
    public static void main(String args[]) {
        int[] a = {1, 2, 1, 3, 2, 4, 5, 5};
        int max = a[0], min = a[0];

        for (int i = 1; i < a.length; i++) {  /* note this is done if user himself
                                                 does not enter the value of max and min */
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }

        }
        countingSort(a, min, max);

        System.out.print("the sorted array is \n");

        for (int element : a) {
            System.out.print(element + " ");

        }

    }

    public static void countingSort(int a[], int min, int max) {


        int[] B = new int[(max - min) + 1];

        for (int i = 0; i < a.length; i++) {  // to assign the counting array to count the
            // no of occurrences of each element
            B[a[i] - min]++;
        }

        int j = 0;
        for (int i = min; i < max; i++) { //as the whole of the array A or out input array
                                          // will be between min and max element

            while (B[i - min] > 0) {
                a[j++] = i;
                B[i - min]--;
            }

        }

    }
}
