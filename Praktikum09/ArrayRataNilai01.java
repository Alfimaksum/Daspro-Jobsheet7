package Praktikum09;

import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        // Memasukkan nilai ke dalam array
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata
        rata2 = total / nilaiMhs.length;

        // Menampilkan rata-rata
        System.out.println("Rata-rata nilai = " + rata2);
    }
}