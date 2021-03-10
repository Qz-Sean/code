public class Test2{
	public static void main (String[] args){
		int i,j,sum;
		System.out.print("1000以内的完数分别是：");
		for(i=1;i<=1000;i++){
			sum=0;
			for(j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.print(i+" ");
			}
		}
	}
}