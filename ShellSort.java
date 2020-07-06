package com.company.Sorting;

import java.lang.reflect.Array;

public class ShellSort<a> {
    public static void main(String args[]) {

        int[] a = {5, 4, 3, 2, 1};
        int j, gap, n = a.length;
        int newElement;

        for (gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i <n ; i++) {

                j = i;
                newElement = a[i];

                while (j >= gap && a[j - gap] > newElement) {  // here it will not be a[i] as a[i] gets replaced eg 32545
                    a[j] = a[j - gap];// now we will compare the 0th element with the 2nd element
                     j -= gap;        // i.e 3,5 and here when condition fails and swap does not occur

                }
                a[j] = newElement;


            }

        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }


}




