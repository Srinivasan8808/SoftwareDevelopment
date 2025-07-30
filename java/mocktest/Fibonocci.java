import java.util.Scanner;

class Fibonocci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("enter number");
		int a=sc.nextInt();
		int o=a;
		int sum=0;
		while(a>0){
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		
	}
	if(o==sum){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
}
}