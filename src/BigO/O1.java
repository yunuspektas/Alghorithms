package BigO;
//array ne kadar büyük olursa olsun, çalıştırılma süresi
// hep sabit olacaktır çünkü bizim istediğimiz array’in
// son elemanıdır.
public class O1 {
    // Constant Complexity ( diğer ismi )
    public static void main(String[] args) {
        int[] arr = {10, 2, 20, 11000, 32142, 32131};
        System.out.println(arr[arr.length - 1]);

        // başka bir örnek , sayı tek mi çift mi bulalım
        int x = 24;
        if(x%2==0) System.out.println("even");

    }


}
