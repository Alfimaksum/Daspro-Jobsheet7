package Praktikum09;

import java.util.Scanner;
public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Memasukkan nilai ke dalam array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = scanner.nextInt();
        }

        // Menampilkan nilai dalam array
        System.out.println("\nNilai akhir yang telah dimasukkan:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + (i + 1) + " adalah: " + nilaiAkhir[i]);
        }
    }
}