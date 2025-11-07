import java.util.Scanner;

public class Tugas3CariMenuCafe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };
        
        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        
        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = input.nextLine();
        
        int hasil = -1; // -1 artinya tidak ditemukan
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                hasil = i;
                break;
            }
        }
        
        System.out.println("\n=== HASIL PENCARIAN ===");
        if (hasil != -1) {
            System.out.println("Makanan \"" + menu[hasil] + "\" ditemukan!");
            System.out.println("Posisi di menu: Nomor " + (hasil + 1));
            System.out.println("Status: Tersedia");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
            System.out.println("Silakan pilih makanan lain yang tersedia.");
        }
        
        input.close();
    }
}