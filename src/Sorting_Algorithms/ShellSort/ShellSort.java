package Sorting_Algorithms.ShellSort;

public class ShellSort {
    public static void shellSort(int[] a) {
        /*
        for (int increment = a.length / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < a.length; i++) {
                int temp = a[i];
                for (int j = i; j >= increment && a[j - increment] > temp; j -= increment){
                    a[j] = a[j - increment];
                    a[j - increment] = temp;
                }
            }
        }
        */

            int insert;
            int moveItem;
            for(int gap=a.length/2; gap>0; gap/=2)
            {
                for(int next=gap; next<a.length; next++)
                {
                    insert = a[next];
                    moveItem = next;
                    while(moveItem >= gap && insert < a[moveItem-gap])
                    {
                        a[moveItem] = a[moveItem-gap];
                        moveItem -= gap;
                    }
                    a[moveItem] = insert;
                }

            }
    }

}
