import java.util.Scanner;

public class GajiKaryawan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJamKerja = scanner.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();

        double gajiPokok = jumlahJamKerja * upahPerJam;
        double bonus = 0.10 * gajiPokok;
        double gajiKotor = gajiPokok + bonus;
        double pajak = 0.05 * gajiKotor;
        double gajiBersih = gajiKotor - pajak;

        System.out.println("Gaji bersih: Rp " + gajiBersih);

        scanner.close();
    }
}