package Praktikum07;

import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int durasi;
        String jenisKendaraan;
        
        while (true) {
            // Minta input durasi parkir
            System.out.print("Masukkan durasi parkir (jam, 0 untuk keluar): ");
            durasi = sc.nextInt();
            
            // Cek jika input adalah 0 untuk keluar
            if (durasi == 0) {
                break;
            }
            
            // Minta jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
            jenisKendaraan = sc.next().toLowerCase();
            
            // Variabel untuk menyimpan total biaya
            int totalBiaya;
            
            // Hitung biaya parkir
            if (durasi > 5) {
                totalBiaya = 12500; // Tarif tetap
            } else {
                if (jenisKendaraan.equals("mobil")) {
                    totalBiaya = durasi * 3000; // Biaya per jam untuk mobil
                } else if (jenisKendaraan.equals("motor")) {
                    totalBiaya = durasi * 2000; // Biaya per jam untuk motor
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                    continue; // Kembali ke awal jika jenis kendaraan tidak valid
                }
            }
            
            // Tampilkan total biaya
            System.out.println("Total biaya parkir: Rp " + totalBiaya);
        }
        
        // Menutup scanner
        sc.close();
        System.out.println("Program selesai.");
    }
}