import java.util.Scanner;

class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int b=num;
		int rev=0;
		while(num>0){
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(rev==b){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
		
		
	}
}