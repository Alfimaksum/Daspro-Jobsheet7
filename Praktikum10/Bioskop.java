package Praktikum10;

import java.util.Scanner;
public class Bioskop {
    static String[][] penonton = new String[4][2]; // Array untuk menyimpan data penonton

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = pilihMenu(sc);

            switch (pilihan) {
                case 1:
                    inputDataPenonton(sc);
                    break;
                case 2:
                    tampilkanDaftarPenonton();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } while (pilihan != 3);
    }

    // Fungsi untuk menampilkan menu
    static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
    }

    // Fungsi untuk meminta pengguna memilih menu
    static int pilihMenu(Scanner scanner) {
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        return pilihan;
    }

    // Fungsi untuk input data penonton
    static void inputDataPenonton(Scanner scanner) {
        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            boolean kursiTersedia = false;
            do {
                System.out.print("Masukkan baris (1-4): ");
                int baris = validasiInputBarisKolom(scanner, 1, 4);
                System.out.print("Masukkan kolom (1-2): ");
                int kolom = validasiInputBarisKolom(scanner, 1, 2);

                // Periksa apakah kursi sudah terisi
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    kursiTersedia = true;
                } else {
                    System.out.println("Maaf, kursi baris " + baris + " kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                }
            } while (!kursiTersedia);

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = scanner.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    // Fungsi untuk menampilkan daftar penonton
    static void tampilkanDaftarPenonton() {
        System.out.println("\nData penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                System.out.print(isiKursi + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk validasi input baris dan kolom
    static int validasiInputBarisKolom(Scanner scanner, int min, int max) {
        int input;
        do {
            input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input tidak valid. Silakan masukkan angka antara " + min + " dan " + max);
            }
        } while (input < min || input > max);
        return input;
    }
}