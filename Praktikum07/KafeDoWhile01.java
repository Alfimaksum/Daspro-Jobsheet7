package Praktikum07;

import java.util.Scanner;
public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        String namaPelanggan;
        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        // Perulangan do-while
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = scanner.nextInt();
            System.out.print("Jumlah teh: ");
            teh = scanner.nextInt();
            System.out.print("Jumlah roti: ");
            roti = scanner.nextInt();

            // Hitung total harga
            totalHarga = kopi * hargaKopi + teh * hargaTeh + roti * hargaRoti;
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        } while (true); // Perulangan terus berulang sampai kondisi break terpenuhi

        System.out.println("Terima kasih telah berbelanja!");
    }
}