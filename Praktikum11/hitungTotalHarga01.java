package Praktikum11;

import java.util.Scanner;
public class hitungTotalHarga01 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);
        }
        
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        sc.close();
    }
}