package com.company.sorting;

public class RadixSortForStrings {
    public static void main(String[] args) {
        String[] radixArray = {"bcdef", "aabbb", "abcde", "edcbe", "dbdaa"};

        radix(radixArray,26,5);

        //output
        for (String element : radixArray) {
            System.out.print(element + " ");
        }
    }

    public static void radix(String[] input, int radix, int width) {
        /*this loop runs backwards because we want the last character at a position eg in "bcdef"
        first we will sort on the basis of 'f' then 'e' ... till 'b' */
        for (int i = width-1; i >=0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix) {
        int n = input.length;
        int[] count = new int[radix];

        for (String value : input) {
            //this will initialize a normal count array that records count of no of a's,b's...
            count[getIndex(position, value)]++;
        }

        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
            /* this is used to make the sort stable sort and for that what we do is modify
               our count array to count the no of occurrences of a character <= the character
               i.e for 'c' we will get the count of all characters than 'c' i.e 'c','b','a' */
        }

        String[] temp = new String[n];

        //Actual logic
        for (int i = n - 1; i >= 0; i--) {
            temp[--count[getIndex(position, input[i])]] = input[i];
        }

        // for copying the temp array in the permanent array
        System.arraycopy(temp, 0, input, 0, n);
    }

    // it should return the index of the value, suppose value = 'b'
    public static int getIndex(int position, String value) {
        // 'b'-'a' ==> 98-97 = 1 in ASCII
        return value.charAt(position) - 'a';
    }
}


