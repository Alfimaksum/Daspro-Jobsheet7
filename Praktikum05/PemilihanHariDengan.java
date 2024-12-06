import java.util.Scanner;

public class PemilihanHariDengan {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        String jenisHari;

        if (angka >= 1 && angka <= 5) {
            jenisHari = "Weekday";
        } else if (angka == 6 || angka == 7) {
            jenisHari = "Weekend";
        } else {
            jenisHari = "Invalid Number";
        }

        System.out.println("Angka " + angka + " adalah " + jenisHari);
    }
}