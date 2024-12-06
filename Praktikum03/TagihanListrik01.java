import java.util.Scanner;

public class TagihanListrik01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan penggunaan listrik (kWh): ");
        double penggunaanListrik = scanner.nextDouble();
        System.out.println(penggunaanListrik);
        System.out.println("penggunaanListrik");

        double tarifPerKwh = 1500;
        String nama = "Maksum";
        System.out.println(nama);
        double totalBiaya = penggunaanListrik * tarifPerKwh;

        System.out.println("Total biaya listrik: Rp " + totalBiaya);

        if (penggunaanListrik > 500) {
            System.out.println("Peringatan: Penggunaan listrik melebihi 500 kWh. Mungkin ada biaya tambahan.");
        }

        scanner.close();
    }
}