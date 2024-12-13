package Praktikum11;

import java.util.Scanner;

public class HitungLuasVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Persegi Panjang
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();  
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        int luasPersegiPanjang = hitungLuas(panjang, lebar);
        System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);

        // Balok
        System.out.print("Masukkan panjang balok: ");
        int panjangBalok = input.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int lebarBalok = input.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int tinggiBalok = input.nextInt();

        int volumeBalok = hitungVolume(panjangBalok, lebarBalok, tinggiBalok);
        System.out.println("Volume balok adalah: " + volumeBalok);
    }

    // Fungsi untuk menghitung luas persegi panjang
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Fungsi untuk menghitung volume balok
    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }
}