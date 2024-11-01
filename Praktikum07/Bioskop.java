package Praktikum07;

import java.util.Scanner;
public class Bioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        final double HARGA_TIKET = 50000;
        
        while (true) {
            // Minta input jumlah tiket
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();
            
            // Cek jika input adalah 0 untuk keluar
            if (jumlahTiket == 0) {
                break;
            }
            
            // Validasi input jumlah tiket
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                continue; // Kembali ke awal jika input tidak valid
            }
            
            // Hitung total harga tiket
            double totalHarga = jumlahTiket * HARGA_TIKET;
            if (jumlahTiket > 10) {
                totalHarga *= 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; // Diskon 10%
            }
            
            // Update total tiket terjual dan total pendapatan
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;
            
            // Tampilkan total tiket dan pendapatan
            System.out.println("Total tiket terjual: " + totalTiketTerjual);
            System.out.println("Total pendapatan: Rp " + totalPendapatan);
        }
        
        // Menutup scanner
        scanner.close();
        System.out.println("Program selesai. Total tiket terjual: " + totalTiketTerjual + ", Total pendapatan: Rp " + totalPendapatan);
    }
}