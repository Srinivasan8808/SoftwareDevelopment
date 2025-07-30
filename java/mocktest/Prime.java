import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("number :");
		int a=sc.nextInt();
		int count=0;
		
		for(int i=1;i<a/2;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==1){
		System.out.println("Prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}
}