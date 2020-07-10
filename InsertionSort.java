package com.company.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >=0 && current < a[j]) {
                a[j + 1] = a[j];//shifting the elements to the right
                j--;
            }
            // replacing the leftmost element with the current element as it get overwritten
            a[j + 1] = current;
            /*   eg a= 5 4 3 2 1
                  5 5 3 2 1 , current =4
                  4 5 3 2 1 , the overwritten element gets replaced by current element */
        }
        //for output
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
