package Praktikum09;

import java.util.Scanner;
public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah elemen
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = scanner.nextInt();

        // Membuat array dengan ukuran sesuai input
        int[] arrNilai = new int[n];

        // Meminta input nilai-nilai elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        // Meminta input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        // Mencari indeks nilai yang dicari
        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }

        scanner.close();
    }
}