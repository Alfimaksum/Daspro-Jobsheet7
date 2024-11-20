package Praktikum09;

import java.util.Scanner;
public class Kafe01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
    
        String[] daftarPesanan = new String[100];
        int[] jumlahPesanan = new int[100];
        double[] hargaPesanan = new double[100]; 
        int pesananCount = 0;
        double totalHarga = 0;
    
        System.out.println("Selamat datang di Cafe!");
        System.out.println("------------------------Daftar Menu Makanan------------------------");
        System.out.println("Nasi Goreng Rp 20.000");
        System.out.println("Mie Goreng Rp 22.000");
        System.out.println("Roti Bakar Rp 15.000");
        System.out.println("Kentang Goreng Rp 17.000");
        System.out.println("------------------------Daftar Menu Minuman------------------------");
        System.out.println("Teh Tarik Rp 13.000");
        System.out.println("Cappuccino Rp 18.000");
        System.out.println("Chocolatte Ice Rp 20.000");
        System.out.println("-------------------------------------------------------------------");
    
        while (true) {
            System.out.print("Masukkan nama menu (atau ketik 'selesai' untuk mengakhiri): ");
            String namaMenu = sc.nextLine();
    
            if (namaMenu.equalsIgnoreCase("selesai")) {
                break;
            }
    
            System.out.print("Masukkan jumlah: ");
            int jumlah = sc.nextInt();
            sc.nextLine();  
    
            int indexMenu = -1;
            for (int i = 0; i < daftarMenu.length; i++) {
                if (daftarMenu[i].equalsIgnoreCase(namaMenu)) {
                    indexMenu = i;
                    break;
                }
            }
    
            if (indexMenu != -1) {
                daftarPesanan[pesananCount] = namaMenu;
                jumlahPesanan[pesananCount] = jumlah;
                hargaPesanan[pesananCount] = daftarHarga[indexMenu];
                pesananCount++;
    
                double hargaItem = daftarHarga[indexMenu] * jumlah;
                totalHarga += hargaItem;
            } else {
                System.out.println("Maaf, menu tidak tersedia.");
            }
        }
    
        System.out.println("\nDaftar Pesanan:");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Nama Menu", "Jumlah", "Harga/Item", "Total");
        for (int i = 0; i < pesananCount; i++) {
            double totalHargaItem = hargaPesanan[i] * jumlahPesanan[i];
            System.out.printf("%-20s %-10d %-10.2f %-10.2f\n", daftarPesanan[i], jumlahPesanan[i], hargaPesanan[i], totalHargaItem);
        }
        System.out.println("\nTotal harga yang harus dibayar: Rp " + totalHarga);
    }
}
