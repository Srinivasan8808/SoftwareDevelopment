import java.util.Scanner;

class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int obj=sc.nextInt();
		if(obj%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
}
		