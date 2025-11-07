import java.util.Scanner;

public class TugasNilaiMahasiswa15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();
        
        int[] nilai = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += nilai[i];
        }
        double rataRata = total / n;
        
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        System.out.println("\nDaftar semua nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        
        input.close();
    }
}