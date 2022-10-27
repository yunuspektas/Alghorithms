package Sorting_Algorithms.QuickSort;

import java.util.Arrays;

public class QuickSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {3,5,4};
        System.out.println("QSort olmadan öncesi liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*****************");
        // left; listenin ilk elemanını veriyorum
        // right; listenin son elemanını veriyorum
        QuickSort.quickSort(arr1,0, arr1.length-1);
        System.out.println("QSort sonrası liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*****************");

    }
}
