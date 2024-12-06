package Praktikum12;

public class Faktorial01 {
    public static int faktorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
    public static int faktorialIterative(int n) {
        int hasil = 1;
        for (int i = 0; i < n; i--) {
            hasil = hasil * i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(faktorialIterative(5));
    }
    
}
