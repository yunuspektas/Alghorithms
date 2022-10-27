package Sorting_Algorithms.SelectionSort;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int min ;
        //int i =0;  bunu anlat  for (; i < arr.length; i++)
        for (int i=0 ; i < arr.length; i++) {
            min = i;
            //for içinde seçilen indexin sağında kalanlardan
            // en küçüğü bulunuyor
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap işlemi
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}
