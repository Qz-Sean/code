public class Multiplication_table {
    public static void main(String[] args) {
        int i = 1, j = 1;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%d×%d=%d \t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
