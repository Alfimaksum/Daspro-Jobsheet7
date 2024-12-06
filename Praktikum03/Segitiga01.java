import java.util.Scanner;

public class Segitiga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variable alas dan tinggi dengan tipe data int, dan luas dengan tipe data float
        int alas, tinggi;
        float luas;
        
        // Meminta input dari pengguna untuk alas dan tinggi
        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        
        // Menghitung luas menggunakan rumus luas segitiga
        luas = (float) (alas * tinggi / 2.0); // Perhitungan dengan casting ke float
        
        // Menampilkan hasil luas segitiga
        System.out.println("Luas segitiga: " + luas);
        
        sc.close(); // Menutup scanner
    }
}
