package Praktikum08;

import java.util.Scanner;
public class PersegiAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            // Cetak baris pertama
            for (int i = 0; i < N; i++) {
                System.out.print(N);
            }
            System.out.println();

            // Cetak baris kedua hingga baris N-1
            for (int i = 1; i < N - 1; i++) {
                System.out.print(N);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(N);
                System.out.println();
            }

            // Cetak baris terakhir
            for (int i = 0; i < N; i++) {
                System.out.print(N);
            }
            System.out.println();
        }
    }
}
