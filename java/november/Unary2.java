class Unary2{
public static void main(String[] args){
	int a=5;
	int b=a++ + a++;
	System.out.println(b);
	
	int c=9;
	int d=c-- + c--;
	System.out.println(d);
	
	int r=15;
	int s=r-- + r-- + r--;
	System.out.println(s);
	
	int x=13;
	int y=15;
	int z=x-- + y++ + x-- +y++;
	System.out.println(z);
	System.out.println("**********************************Unary pre operation");
	
	int e=3;
	System.out.println(++e);
	System.out.println(e);
	
	System.out.println("*****************************************");
	int f=7;
	System.out.println(--f);
	System.out.println(f);
	
	int i=19;
	System.out.println(--i);
	System.out.println(i--);
	System.out.println(i);
	
	
	

}
}
	