package Sorting_Algorithms.BubbleSort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println("BSort öncesi liste : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********");
        BubbleSort.bubbleSort(arr);
        System.out.println("BSort sonrası liste : ");
        System.out.println(Arrays.toString(arr));
    }
}
