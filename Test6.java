public class Test6 {
    public static void main(String args[]) {
        int count = 1;
        double i = 1, sum = 0;
        do {
            i = i * count++;
            sum = sum + 1 / i;
        } while (count <= 20);
        System.out.print("1+1/2!+1/3!+...+1/20!="+sum);
    }
}
