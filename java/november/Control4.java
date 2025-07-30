class Control4{
	public static void main(String[] args){
		int age=9;
		if(age<=3){
			System.out.println("free");
		}
		else if(age>3 && age<10){
			System.out.println("half");
		}
		else if(age>10 && age<=60){
			System.out.println("full");
		}
		else{
			System.out.println("sr citizen");
		}
	}
}