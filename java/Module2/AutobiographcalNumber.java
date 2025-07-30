import java.util.Scanner;

class AutobiographcalNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		int sum=0;
		
		while(num>0){
			count++;
			 int num2=num%10;
			 sum=sum+num2;
			 num=num/10;
		}
		if(count==sum){
			System.out.println(num1+"Autobigraphical number");
		}
		else{
			System.out.println(num1+"not autoboigraphical number");
		}
	}
}