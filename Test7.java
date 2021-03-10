public class Test7 {
    public static void main(String args[]) {
        int i;
        double sum = 0, n = 1;
        for (i = 1; i <= 20; i++) {
            n = n * i;
            sum = sum + 1/n;
        }
        System.out.print("1+1/2!+1/3!+...+1/20!="+sum);
    }
}
