package Praktikum07;

import java.util.Scanner;
public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, hargaTiket = 50000, totalTiketTerjual = 0, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang.");
                continue; // Ulangi perulangan tanpa menghitung
            } else if (jumlahTiket == 0) {
                break; // Keluar dari perulangan
            }

            totalTiketTerjual += jumlahTiket;

            // Hitung diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.1; // Diskon 10%
            }

            // Hitung total penjualan untuk transaksi ini
            int totalPenjualanTransaksi = (int) (jumlahTiket * hargaTiket * (1 - diskon));
            totalPenjualan += totalPenjualanTransaksi;

            System.out.println("Total penjualan untuk transaksi ini: Rp " + totalPenjualanTransaksi);
        } while (true);

        System.out.println("\nTotal tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan seluruhnya: Rp " + totalPenjualan);
    }
}