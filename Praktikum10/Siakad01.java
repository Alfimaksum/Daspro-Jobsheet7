package Praktikum10;

import java.util.Scanner;
public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Membuat array dua dimensi dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        // Memasukkan nilai mahasiswa
        for (int i = 0; i < jumlahSiswa; i++) {
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menghitung dan menampilkan rata-rata nilai siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            int totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (double)totalPerSiswa / jumlahMataKuliah);
        }

        // Menghitung dan menampilkan rata-rata nilai mata kuliah
        for (int j = 0; j < jumlahMataKuliah; j++) {
            int totalPerMataKuliah = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mata kuliah ke-" + (j + 1) + ": " + (double)totalPerMataKuliah / jumlahSiswa);
        }
    }
}