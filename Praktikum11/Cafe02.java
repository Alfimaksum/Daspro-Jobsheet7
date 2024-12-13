package Praktikum11;

public class Cafe02 {
    public static void main(String[] args) {
        // Memanggil fungsi Menu dengan parameter
        String namaPelanggan = "Andi";
        boolean isMember = true;
        String kodePromo = "DISKON30";
        Menu(namaPelanggan, isMember, kodePromo);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        // Cek status member
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Cek kode promo
        if ("DISKON50".equalsIgnoreCase(kodePromo)) {
            System.out.println("Anda mendapatkan diskon 50%");
        } else if ("DISKON30".equalsIgnoreCase(kodePromo)) {
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid");
        }

        // Tampilkan menu
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=====================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        
       
    }
}