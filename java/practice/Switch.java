import java.util.Scanner;

class Switch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{			System.out.println("COD");}
			break;
			case 2: 
			{System.out.println("CARD"); }
			break;
			case 3: 
			{System.out.println("UPI"); }
			break;
			default:System.out.println("invalid");
		}
	}
}
			
			