package Sorting_Algorithms.SelectionSort;


import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {7,4,5,9,8,2,1};
        System.out.println("SelectionSort sıralama öncesindeki liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************");
        System.out.println("Selection Sort ile Sıralanmış liste : ");
        SelectionSort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************");

    }

}
