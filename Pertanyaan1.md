1. Jika isi array diubah menjadi 5.0, 12867, 7.5, 2000000
Jawaban:
Akan muncul error (kesalahan) pada saat program dijalankan atau dikompilasi.
-Penjelasan:
Karena array bil bertipe integer (int), sedangkan nilai 5.0 dan 7.5 adalah bilangan desimal (tipe double).
2. public class ArrayBilangan01 {
    public static void main(String[] args) {
        int[] bil = {5, 13, -7, 17};  // inisialisasi langsung

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}
3. Penjelasan:
Perulangan for membuat program menampilkan isi array satu per satu dari indeks 0 sampai 3.
4. Jika kondisi diubah menjadi i <= 4
-Yang terjadi:
Akan muncul error “ArrayIndexOutOfBoundsException” (indeks di luar batas array).
-Penjelasan:
Karena array bil hanya punya indeks 0, 1, 2, 3.
Ketika i = 4, program mencoba mengakses bil[4] yang tidak ada.

