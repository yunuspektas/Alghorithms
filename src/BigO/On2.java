package BigO;
//Quadratic Complexity input büyüklüğünün karesi
// ile doğru orantılıdır.
//
//Eğer input büyüklüğü 2 ise, 4 işlem gerçekleşir.
// Eğer input büyüklüğü 8 ise, 64 işlem gerçekleşir
// ve bu şekilde devam eder. Genellikle sıralama (sorting)
// algoritmalarında bu complexity görülür.
public class On2 { // O(N^2)
    public static void main(String[] args) {
        int count = 0;  // 1 işlem
        int[] arr = {2,1,5}; // 1 işlem
        // yukardaki 2 işlem alttaki for döngüsü ile karşı-
        // laştırıldığında göz ardı edilebilir.
        // iç içe döngülerde N*N gibi bir complexity oluşur
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + arr[j] );
                count++;
            }
            // çıktı kontrol edilirse 3 elemana karşılık 9
            // adet çıktı olduğu görülecek.
        }
    }
}
