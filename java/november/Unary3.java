class Unary3{
public static void main(String[] args){
	int p=17;
	int q=++p + ++p + ++p;
	System.out.println(q);
	
	int a=12;
	int b=11;
	int c=++a + --b + ++a + --b;
	System.out.println(c);
	
	int x=16;
	int y=18;
	int z=--x + ++y + ++x + --y;
	System.out.println(z);
}
}