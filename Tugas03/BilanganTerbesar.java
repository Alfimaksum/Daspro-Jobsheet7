package Tugas03;

import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int bil1, bil2, bil3, terbesar;

        // Input bilangan
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = sc.nextInt();

        // Perbandingan pertama (antara bil1 dan bil2)
        terbesar = bil1;
        if (bil2 > terbesar) {
            terbesar = bil2;
        }

        // Perbandingan kedua (antara terbesar dan bil3)
        if (bil3 > terbesar) {
            terbesar = bil3;
        }

        // Output
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}