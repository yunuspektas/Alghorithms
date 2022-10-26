package BigO;
//Linear complexity’de, elimizdeki veri seti arttıkça,
// çalıştırılma süreside doğru orantılı şekilde artış gösterir.
public class On { //O(N)
    // arrayın bütün elemanlarını ekrana basalım
    public static void main(String[] args) {
        int[] arr = {21,23,32,13,12,41,321,4,12};
        for (int item:arr) { // bu döngüde array boyutu kadar
            // işlem gerçekleşir
            System.out.print(item + ", ");
        }
    }
}
