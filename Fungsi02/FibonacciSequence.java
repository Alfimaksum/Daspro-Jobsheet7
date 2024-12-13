package Fungsi02;

import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        // Validasi input
        if (n <= 0) {
            System.out.println("Masukkan angka positif.");
        } else {
            int a = 1; // Bilangan Fibonacci pertama
            int b = 1; // Bilangan Fibonacci kedua

            // Menampilkan bilangan Fibonacci
            System.out.print("Pola Fibonacci: ");
            System.out.print(a); // Cetak bilangan pertama
            if (n > 1) {
                System.out.print(" " + b); // Cetak bilangan kedua
            }

            for (int i = 3; i <= n; i++) {
                int c = a + b; // Hitung bilangan Fibonacci berikutnya
                System.out.print(" " + c); // Cetak bilangan Fibonacci berikutnya
                a = b; // Geser nilai a ke b
                b = c; // Geser nilai b ke c
            }
            System.out.println(); // Pindah ke baris baru
        }

        scanner.close();
    }
}
