package Praktikum08;

import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Jumlah cabang olahraga
        int jumlahCabang = 4;
        
        // Array untuk menyimpan nama cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        // Array 2 dimensi untuk menyimpan nama atlet (5 atlet per cabang)
        String[][] namaAtlet = new String[jumlahCabang][5];
        
        // Input data atlet untuk setiap cabang
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j+1) + ": ");
                namaAtlet[i][j] = scanner.nextLine();
            }
        }
        
        // Menampilkan data atlet yang telah dimasukkan
        System.out.println("\nDaftar Atlet Porseni:");
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + namaAtlet[i][j]);
            }
        }
        
        scanner.close();
    }
}