import java.util.Scanner;

class Deficient{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int a=sc.nextInt();
		int sum=0;
		
		
		for(int i=1;i<=a/2;i++){
			if(a%i==0){
				sum=sum+i;
			}
		}
		if(sum==a){
			System.out.println(num+"is perfect number");
		}
		else if(sum<a){
			System.out.println(num+"is deficient number");
		}
		else{
			System.out.println(num+"is abundant number");
		}
	}
}
			