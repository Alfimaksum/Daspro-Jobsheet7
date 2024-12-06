package Pemilihan02;

import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus, novel, lain): ");
        String jenisBuku = scanner.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        double diskon = 0;

        switch (jenisBuku.toLowerCase()) {
            case "kamus":
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
                break;
            case "novel":
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
                break;
            default:
                if (jumlahBuku > 3) {
                    diskon = 5;
                }
                break;
        }

        System.out.println("Total diskon: " + diskon + "%");
    }
} 
    