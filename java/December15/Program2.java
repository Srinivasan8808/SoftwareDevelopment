class Program2{
static int fact(int a){
		int fact=1;
		while(a>1){
			fact=fact*a;
			a--;
		}
		return fact;
}
public static void main(String[] args){
		for(int i=0;i<5;i++){
			System.out.println("factorial:"+fact(i));
		}
}
}

	