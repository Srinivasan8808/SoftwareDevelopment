import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		int num=a;
		
		while(a>0){
			int n=a%10;
			rev=rev*10+n;
			a=a/10;
		}
		if(rev==num){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}