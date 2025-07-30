class Program5{
	public static void main(String[] args){
		int num=19;
		int a=1;
		int count=0;
		
		while(a<=num/2){
			if(num%a==0){
				count++;
			}
			a++;
		}
		if(count==1){
			System.out.println("prime number");
		}
		else{
			System.out.println("Not a prime number");
		}
		
	}
}