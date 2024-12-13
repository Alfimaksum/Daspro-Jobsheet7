import java.util.Scanner;
public class KRSProgram02 {

    static String[] namaMahasiswa = new String[100];
    static String[] nimMahasiswa = new String[100];
    static String[][] kodeMK = new String[100][10];
    static String[][] namaMK = new String[100][10];
    static int[][] sksMK = new int[100][10];
    static int[] totalSKS = new int[100];
    static int jumlahMahasiswa = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Pendaftaran KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS Mahasiswa");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    tambahKRS();
                    break;
                case 2:
                    tampilkanKRS();
                    break;
                case 3:
                    analisisSKS();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void tambahKRS() {
        System.out.println("\n=== Tambah Data KRS ===");
        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa[jumlahMahasiswa] = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        nimMahasiswa[jumlahMahasiswa] = scanner.nextLine();

        int jumlahMK = 0;
        while (true) {
            System.out.print("Masukkan kode mata kuliah: ");
            kodeMK[jumlahMahasiswa][jumlahMK] = scanner.nextLine();

            System.out.print("Masukkan nama mata kuliah: ");
            namaMK[jumlahMahasiswa][jumlahMK] = scanner.nextLine();

            System.out.print("Masukkan jumlah SKS mata kuliah (1-3): ");
            int sks = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3.");
                continue;
            }

            if (totalSKS[jumlahMahasiswa] + sks > 24) {
                System.out.println("Total SKS melebihi batas maksimal (24 SKS). Mata kuliah tidak dapat ditambahkan.");
                break;
            }

            sksMK[jumlahMahasiswa][jumlahMK] = sks;
            totalSKS[jumlahMahasiswa] += sks;
            jumlahMK++;

            System.out.print("Tambah mata kuliah lagi? (y/n): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("y")) {
                break;
            }
        }

        jumlahMahasiswa++;
        System.out.println("\nData KRS berhasil ditambahkan untuk mahasiswa: " + namaMahasiswa[jumlahMahasiswa - 1]);
    }

    static void tampilkanKRS() {
        System.out.println("\n=== Tampilkan Daftar KRS Mahasiswa ===");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nimMahasiswa[i].equals(nim)) {
                System.out.println("\nDaftar KRS:");
                System.out.printf("%-15s %-15s %-10s %-25s %-3s\n", "NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS");
                System.out.println("--------------------------------------------------------------------------------");
                for (int j = 0; j < 10; j++) {
                    if (kodeMK[i][j] == null) break;
                    System.out.printf("%-15s %-15s %-10s %-25s %-3d\n", nimMahasiswa[i], namaMahasiswa[i], kodeMK[i][j], namaMK[i][j], sksMK[i][j]);
                }
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Total SKS: " + totalSKS[i]);
                return;
            }
        }
        System.out.println("Data mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    static void analisisSKS() {
        System.out.println("\n=== Analisis Data KRS ===");
        int count = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (totalSKS[i] < 20) {
                count++;
            }
        }
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + count);
    }
}