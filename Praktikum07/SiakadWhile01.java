package Praktikum07;

import java.util.Scanner;
public class SiakadWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml, nilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        int i = 0;
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai = sc.nextInt();

            while (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
                nilai = sc.nextInt();
            }

            if (nilai >= 90 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah A");
            } else if (nilai >= 80 && nilai < 90) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B");
            } else if (nilai >= 75 && nilai < 80) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B-");
            } else if (nilai >= 65 && nilai < 75) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C+");
            } else if (nilai >= 60 && nilai < 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C");
            } else if (nilai >= 50 && nilai < 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah E");
            }

            i++;
        }
    }
}