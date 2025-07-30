import java.util.Scanner;

class BeautifulNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter");
		int num=sc.nextInt();
		int num1;
		int count=0;
		int count1=0;
		
		while(num>0){
			num1=num%10;
			if(num1%2==0){
				count++;
			}
			else{
				count1++;
			}
		}
		if(count==count1){
			System.out.println(num+"Beautiful number");
		}
		else{
			System.out.println(num+"not Beautiful number");
		}
	}
}