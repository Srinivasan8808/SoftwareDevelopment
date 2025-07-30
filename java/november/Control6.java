class Control6{
	public static void main(String[] args){
		char ch='A';
		if(ch>='A' && ch<='Z'){
			System.out.println("Upper case");
		}
		else if(ch>='a' && ch<='z'){
			System.out.println("lower case");
		}
		else if(ch>='1' && ch<='9'){
			System.out.println("Number");
		}
		else{
			System.out.println("Sysmbol cant be found");
		}
	}
}