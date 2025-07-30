import java.util.Scanner;

class SpyNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		int sum=0;
		int product=1;
		
		while(num>0){
			count++;
			 int num2=num%10;
			 sum=sum+num2;
			 product=product*num2;
			 num=num/10;
		}
		if(product==sum){
			System.out.println(num1+" spy number");
		}
		else{
			System.out.println(num1+" not spy number");
		}
	}
}