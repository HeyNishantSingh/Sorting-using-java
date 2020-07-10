package com.company.Sorting;

public class RadixSort {
    public static void main(String args[]) {
        int radixArray[] = {4725, 4586, 1330, 8792, 1594, 5729};

        radix(radixArray, 10, 4);// width is how many numbers are there in each element in input
        for (int element : radixArray) {
            System.out.print(element + " ");

        }
    }

    public static void radix(int input[], int radix, int width) {//this loop will run for every position or place
        // i.e ones place, tens, hundreds, etc
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int n = input.length;
        int[] count = new int[radix];

        for (int value : input) {

            count[getDigit(position, value, radix)]++;
            //this will initialize a normal count array that records count of no of 1's,2's...
        }

        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
            /* this is used to make the sort stable sort and for that what we do is modify
               our count array to count the no of occurrences of a number <= the number
               i.e for 7 we will get the count of all numbers less than 7 i.e 6,5,4...*/
        }

        int temp[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            temp[--count[getDigit(position, input[i], radix)]] = input[i];//Actual logic
        }

        for (int i = 0; i < n ; i++) {// for copying the temp array in the permanent array
            input[i]=temp[i];

        }

    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
/*
        eg for value = 4725, position = 2 (hundred’s position),the number to be returned should be 7
        Therefore, (4725 / 10 ^ 2) % radix = 10
        47 % 10
        7
*/

    }
}
