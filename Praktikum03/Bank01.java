import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args) {
        // Deklarasi variabel
        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga = 0.0002;
        int lamaMenabung;

        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input tabungan awal dan lama menabung
        System.out.print("Masukkan jumlah tabungan awal: ");
        tabunganAwal = scanner.nextDouble();
        System.out.print("Masukkan lama menabung (bulan): ");
        lamaMenabung = scanner.nextInt();

        // Menghitung bunga
        bunga = persentaseBunga * lamaMenabung * tabunganAwal;

        // Menghitung tabungan akhir
        tabunganAkhir = tabunganAwal + bunga;

        // Menampilkan hasil
        System.out.println("Bunga: Rp " + bunga);
        System.out.println("Tabungan akhir: Rp " + tabunganAkhir);

        scanner.close(); // Menutup objek Scanner
    }
}