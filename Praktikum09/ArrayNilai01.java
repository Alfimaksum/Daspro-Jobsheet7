package Praktikum09;

import java.util.Scanner;
public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Memasukkan nilai ke dalam array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Menampilkan nilai dan status kelulusan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            if (nilaiAkhir[i] >= 70) {
                System.out.println("lulus");
            } else {
                System.out.println("tidak lulus");
            }
        }

        sc.close(); // Menutup Scanner untuk menghindari resource leak
    }
}