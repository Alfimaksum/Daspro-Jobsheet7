package Praktikum08;

import java.util.Scanner;
public class RataNilai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 5) {
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            double rataNilai = (double) totalNilai / 5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
            i++;
        }
    }
}