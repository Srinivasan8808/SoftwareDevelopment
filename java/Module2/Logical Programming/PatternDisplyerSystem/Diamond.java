import java.util.Scanner;

class Diamond{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println(" enter a");
		char a=sc.next().charAt(0);
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				if(k==1 || k==i){
				System.out.print(a+" ");
			}
			else{
				System.out.print(" "+" ");
			}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++){
				if(k==1 || k==n-i){
				System.out.print(a+" ");
			}
			else{
				System.out.print(" "+" ");
			}
			}
			System.out.println();
	}
}
}