package Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {7,4,5,9,8,2,1};
        System.out.println("SelectionSort sıralama öncesindeki liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************");
        System.out.println("Insertion Sort ile Sıralanmış liste : ");
        InsertionSort.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************");
    }
}
