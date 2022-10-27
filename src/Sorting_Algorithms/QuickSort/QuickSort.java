package Sorting_Algorithms.QuickSort;

public class QuickSort {
    /*
    public static void quickSort(int arr[], int left, int right) {
        if( left < right ) {
            // pivotIndex = ortadaki eleman pivot seçiliyor
            int pivotIndex = (int) (left + (right-left)/2);
            int pivotNewIndex = partition(arr, left, right, pivotIndex);
            quickSort(arr, left, pivotNewIndex - 1);
            quickSort(arr, pivotNewIndex + 1, right);
        }
    }

    public static int partition(int arr[], int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        arr[pivotIndex] = arr[right];
        arr[right] = pivotValue;
        int storeIndex = left;
        for(int i=left; i<right; i++) {
            if( arr[i] < pivotValue ) {
                int temp = arr[i];
                arr[i] = arr[storeIndex];
                arr[storeIndex] = temp;
                storeIndex++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[storeIndex];
        arr[storeIndex] = temp;
        return storeIndex;
    }
    */
     public static int partition(int dizi[], int alt, int ust){
         //dizinin son elemanı pivot seçiliyor
         int pivot = dizi[ust];
         int i=(alt-1);
         // ilk iterasyondaki swap işlemine uygun hale getiriliyor
         for(int j=alt; j<ust;j++){
             if(dizi[j]<=pivot){
                 i++;
                 int temp= dizi[i];
                 dizi[i]=dizi[j];
                 dizi[j]=temp;
             }
         }
         //swap işlemi yapılıyor
         int temp = dizi[i+1];
         dizi[i+1]=dizi[ust];
         dizi[ust]=temp;

         return i+1;
     }

     public static void quickSort(int dizi[],int alt,int ust){
         if(alt<ust){
             int pi = partition(dizi,alt,ust);
             //pivot değeri seçip , recursive olarak kendini çağırıyor
             quickSort(dizi,alt, pi-1);
             quickSort(dizi,pi+1, ust);
         }
     }

}
