package com.company.Sorting;

public class MergeSort {
    public static void main(String args[]) {

        int[] a = {5, 4, 3, 2, 1};
        int i, j;

        mergeSort(a, 0, a.length);

        for (int out : a) {
            System.out.print(out + " ");

        }


    }

    private static void mergeSort(int[] input, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;    // mid=2
        //54321 left= 54 right =321
        mergeSort(input, start, mid); // this will be called till the whole left side is sorted 4,5
        mergeSort(input, mid, end);   // this will be called till whole right side is sorted 1,2,3
        merge(input, start, mid, end);


    }

    private static void merge(int[] A, int start, int mid, int end) {
        if (A[mid - 1] <= A[mid]) {   /*  this is used in case that the element before merging
                                           are already sorted eg ig a= {2,1,5,4,3}
                                           this will become a={{1,2},{3,4,5}} this is already sorted hence there is no need to do that again
                                      */
            return;
        }

        int i = start;
        int j = mid;
        int temp = 0; //for counting purpose so as to find how many new elements added to the temp array

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[temp++] = A[i] <= A[j] ? A[i++] : A[j++];
        }

        System.arraycopy(A, i, A, start + temp, mid - i); // for bigger element to take its place
        System.arraycopy(tempArray, 0, A, start, temp); // for replacing overwritten value by temp
       /* eg 5,4,3,2,1          temp ={4}
            in  5,4 will become 5,5 due to first array copy
                5,5 will become 4,5 due to second array copy


             public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

                src − This is the source array.

                srcPos − This is the starting position in the source array.

                dest − This is the destination array.

                destPos − This is the starting position in the destination data.

                length − This is the number of array elements to be copied.
         */
    }
}
