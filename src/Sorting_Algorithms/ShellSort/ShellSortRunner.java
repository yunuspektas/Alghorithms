package Sorting_Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {3,5,4};
        System.out.println("SSort olmadan öncesi liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*****************");
        // left; listenin ilk elemanını veriyorum
        // right; listenin son elemanını veriyorum
        ShellSort.shellSort(arr1);
        System.out.println("SSort sonrası liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*****************");

    }
}
