public class ContohOperator01 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("nilai x++ adalah " + x++);
        System.out.println("setelah operasi, nilai x adalah " + x);

        int y = 7;
        System.out.println("nilai y++ adalah " + ++y);
        System.out.println("setelah operasi, nilai y adalah " + y);

        int z = 12;
        System.out.println(x < z);
        System.out.println(y == x);
        System.out.println(y <= x);
        System.out.println(y <= x && x < z || y == x);

        int i = z ^ x;
        System.out.println("nilai i adalah " + i);

        i %= 4;
        System.out.println("nilai i yang baru adalah " + i);
    }
}
