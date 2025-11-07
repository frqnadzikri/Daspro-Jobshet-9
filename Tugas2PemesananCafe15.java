import java.util.Scanner;

public class Tugas2PemesananCafe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); 
        
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Harga: Rp ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); 
        }
        
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        
        System.out.println("\n========================================");
        System.out.println("         DAFTAR PESANAN KAFE");
        System.out.println("========================================");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-3d. %-25s Rp %.2f\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("Total Biaya: Rp %.2f\n", totalBiaya);
        System.out.println("========================================");
        
        input.close();
    }
}
