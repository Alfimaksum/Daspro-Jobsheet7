package Fungsi01;

import java.util.Scanner;
public class CafeBuMariana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data penjualan
        int[][] penjualan = new int[5][7]; // 5 menu, 7 hari

        // Input data penjualan (bisa diubah menjadi hardcoded jika ingin)
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Penjualan menu ke-" + (i+1) + " hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }

        // Tampilkan seluruh data penjualan
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }

        // Cari menu dengan penjualan tertinggi
        int menuTerlaris = 0;
        int penjualanTertinggi = 0;
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                menuTerlaris = i;
            }
        }
        System.out.println("\nMenu terlaris: " + (menuTerlaris+1) + " (dengan total penjualan " + penjualanTertinggi + ")");

        // Hitung rata-rata penjualan setiap menu
        System.out.println("\nRata-rata penjualan setiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            System.out.println("Menu " + (i+1) + ": " + (double)totalPenjualan / penjualan[i].length);
        }
    }
}