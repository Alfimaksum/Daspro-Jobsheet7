import java.util.Scanner;

public class PemilihanBilangan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Menggunakan operator ternary
        String hasil = (bilangan % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";

        System.out.println(bilangan + " " + hasil);

        scanner.close();
    }
}