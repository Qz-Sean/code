public class Test3 {
	public static void main(String[] args) {
		int i;
		long j = 0, sum = 0;
		for (i = 1; i <= 10; i++) {
			j = j * 10 + 8;
			sum += j;
		}
		System.out.print("8+88+888+...前十项的和为：" + sum);
	}
}