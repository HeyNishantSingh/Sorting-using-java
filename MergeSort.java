package com.company.Sorting;

public class MergeSort {
    public static void main(String args[]) {

        int[] a = {5, 4, 3, 2, 1};
        int i, j;

        mergeSort(a, 0, a.length);

        for (int out : a) {
            System.out.println(out + "");

        }


    }

    private static void mergeSort(int[] input, int start, int end) {

        if(end-start==1){
            return;
        }

        int mid = (start+end)/2;    //54321 left= 54 right =321
        mergeSort(input,start,mid); // this will be called till the whole left side is sorted 4,5
        mergeSort(input,mid,end);   // this will be called till whole right side is sorted 1,2,3
        merge(input, start,mid,end);


    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int temp = 0;

        int[] A = new int[end - start];
        while (i < mid && j < end) {
            A[temp++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + temp, mid - i);
        System.arraycopy(temp, 0, input, start, temp);
    }
}
