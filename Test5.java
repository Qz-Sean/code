public class Test5 {
    public static void main(String args[]) {
        int i, sum = 0, count = 0;
        for (i = 1; sum < 8888; i++) {
            sum += i;
            // if(sum>8500){
            // System.out.print(sum+" "+i+" ");
            // }
            count += 1;
        }
        System.out.print("满足1+2+3+...+n<8888的最大正整数是：" + (count - 1));
    }
}
