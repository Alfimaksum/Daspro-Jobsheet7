package Praktikum06;

import java.util.Scanner;
public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String Member, MetodePembayaran;
        int PilihanMenu, potonganQris = 1000;
        double TotalBayar, Harga, Diskon;

        // Tampilkan menu
        System.out.println("--------------------------------------");
        System.out.println("============ MENU KAFE JTI ===========");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih =");
        PilihanMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n)? ");
        Member = sc.nextLine();
        System.out.println("--------------------------------------");
        

        if (Member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string[]
            Diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (PilihanMenu == 1){
                Harga = 14000;
                System.out.println("Harga Ricebowl = " + Harga );
            } else if (PilihanMenu == 2){
                Harga = 3000;
                System.out.println("Harga Ice Tea = " + Harga);
            } else if (PilihanMenu == 3){
                Harga = 15000;
                System.out.println("Harga Bulding = " + Harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;//menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            //menghitung total bayar setelah diskon
            TotalBayar = Harga - (Harga * Diskon);
            System.out.println("Total bayar setelah diskon = " +TotalBayar);

            if (Member.equalsIgnoreCase("n")) {
                if (PilihanMenu == 1){
                    Harga = 14000;
                    System.out.println("Harga Ricebowl = " + Harga );
                } else if (PilihanMenu == 2){
                    Harga = 3000;
                    System.out.println("Harga Ice Tea = " + Harga);
                } else if (PilihanMenu == 3){
                    Harga = 15000;
                    System.out.println("Harga Bulding = " + Harga);
                } else {
                    System.out.println("Masukan pilihan menu dengan benar");
                    return;//menghentikan eksekusi lebih lanjut jika pilihan salah
                }
                //Menghitung total bayar
                System.out.println("Total bayar = " + Harga);

                
            } else{
                System.out.println("Member Tidak Valid");
            }
            System.out.print("Metode Pembayaran (tunai/QIRIS): ");
            MetodePembayaran = sc.nextLine();
            double hargaAkhir = TotalBayar - Harga;
            if (MetodePembayaran.equalsIgnoreCase("QIRIS")){
                Harga -= potonganQris;
                System.out.println("harga" + hargaAkhir);
            }
            System.out.println("----------------------------------------");
        }
    }
}