package Materi08;

public class PolaB {
    public static void main(String[] args) {
        int baris = 10; // Sesuaikan jumlah baris sesuai keinginan

        for (int i = 1; i <= baris; i++) {
            // Cetak spasi di awal untuk membuat bentuk segitiga
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }

            // Cetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Pindah ke baris baru
            System.out.println();
        }
    }
}