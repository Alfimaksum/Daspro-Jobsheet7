package Fungsi02;

import java.util.Scanner;
public class InvestasiEmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input investasi awal
        System.out.print("Masukkan jumlah investasi awal (P): ");
        double P = scanner.nextDouble();
        
        // Input jumlah tahun
        System.out.print("Masukkan jumlah tahun (N): ");
        int N = scanner.nextInt();
        
        // Keuntungan tahunan
        double r = 11.7 / 100; // konversi persen ke desimal
        
        // Hitung total uang setelah N tahun
        double A = P * Math.pow((1 + r), N);
        
        // Tampilkan hasil
        System.out.printf("Total uang setelah %d tahun adalah: %.2f\n", N, A);
        
        scanner.close();
    }
}