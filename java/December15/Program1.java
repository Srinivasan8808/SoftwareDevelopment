class Program1{
	static boolean verify(int a){
		if(a%2==0){
			return true;
		}
		else{
		return false;}
	}
	public static void main(String[] args){
		boolean bool=verify(12);
		if(bool==true){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}
		