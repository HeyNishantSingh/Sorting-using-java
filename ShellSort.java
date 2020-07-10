package com.company.sorting;

public class ShellSort {
    public static void main(String args[]) {

        int[] inpArr = {5, 4, 3, 2, 1};
        int gap, n = inpArr.length;
        int newElement;

        for (gap = inpArr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int j = i;
                newElement = inpArr[i];

              /*
                 in while loop it will not be inpArr[i] as inpArr[i] gets replaced eg 32545
                 now we will compare the 0th element with the 2nd element
                 i.e 3,5 and here when condition fails and swap does not occur
              */
                while (j >= gap && inpArr[j - gap] > newElement) {
                    inpArr[j] = inpArr[j - gap];
                    j -= gap;
                }
                inpArr[j] = newElement;
            }
        }
        //for output
        for (int i : inpArr) {
            System.out.print(i + " ");
        }
    }
}




