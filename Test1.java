public class Test1{
	public static void main(String[] args){
		int i,j,sum=0;
		for(i=2;i<=100;i++){
			for(j=2;j<i;j++){
				if(i%j == 0){
					break;
				}
			}
			if(j>=i){
				sum+=i;
			}
		}
		System.out.println("100以内质数的和为："+sum);
			
	}
}