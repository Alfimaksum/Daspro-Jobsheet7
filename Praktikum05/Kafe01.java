import java.util.Scanner;

public class Kafe01{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan menu (kopi, teh, coklat): ");
        String menu = scanner.nextLine();

        System.out.print("Masukkan ukuran cup (S, M, L): ");
        char ukuranCup = scanner.next().charAt(0);

        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();

        System.out.print("Apakah anggota? (true/false): ");
        boolean keanggotaan = scanner.nextBoolean();

        // Tentukan harga menu dengan switch-case
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                ;
            case "teh":
                hargaMenu = 8000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia");
                return;
        }

        // Hitung total harga sebelum tambahan ukuran cup
        double totalHarga = hargaMenu * jumlah;

        // Update total harga berdasarkan ukuran cup
        switch (ukuranCup) {
            case 'S':
                totalHarga *= 1.0; // Tidak ada tambahan
                break;
            case 'M':
                totalHarga *= 1.25;
            break;
             case 'L':
                totalHarga *= 1.5;
            break;
        default:
        System.out.println("Ukuran cup tidak valid");
            return; // Keluar dari program jika ukuran tidak valid

        }

// ... (kode selanjutnya)

        // Tentukan diskon berdasarkan status keanggotaan
        double diskon = keanggotaan ? 0.1 : 0; // Diskon 10% jika anggota

        // Hitung nominal yang harus dibayar
        double nominalBayar = totalHarga * (1 - diskon);

        // Tampilkan ringkasan
        System.out.println("\n======================================");
        System.out.println("Rincian Pembelian");
        System.out.println("======================================");
        System.out.printf("Menu\t\t: %s\n", menu);
        System.out.printf("Ukuran Cup\t: %c\n", ukuranCup);
        System.out.printf("Jumlah\t\t: %d\n", jumlah);
        System.out.printf("Total Harga\t: Rp %,10.2f\n", totalHarga);
        System.out.printf("Diskon\t\t: Rp %,10.2f\n", totalHarga * diskon);
        System.out.println("======================================");
        System.out.printf("Total Bayar\t: Rp %,10.2f\n", nominalBayar);
        System.out.println("======================================");
    }
}