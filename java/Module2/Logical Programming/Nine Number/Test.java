class Test{
	public static int sum(int num){
		int sum=0;
		int remainder=0;
		for(int temp=num;temp!=0;temp=temp/10){
			remainder=temp%10;
			sum=sum+remainder;
		}
		return sum;
	}
}