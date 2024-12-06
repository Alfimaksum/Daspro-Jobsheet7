package Tugas03;

import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus, novel, atau lainnya): ");
        String jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }

        System.out.println("Total diskon yang didapatkan: " + diskon + "%");
    }
}