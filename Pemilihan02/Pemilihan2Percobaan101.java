package Pemilihan02;

import java.util.Scanner;
public class Pemilihan2Percobaan101 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();

        if ((tahun % 4 == 0) && ((tahun % 100 != 0) || (tahun % 400 == 0))) {
            System.out.println("tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}