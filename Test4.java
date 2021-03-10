public class Test4 {
    public static void main(String[] args) {
        int i, j, n = 1, sum = 0;
        for (i = 1; i <= 10; i++) {
            n = 1;
            for (j = 2; j <= i; j++) {
                n *= j;
            }
            sum += n;
        }
        System.out.print("1!+2!+...+10!=" + sum);

    }

}