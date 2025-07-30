class Program5{
	public static void main(String[] args){
		String str="Developer";
		
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.lastIndexOf('d'));
		
		int x=str.lastIndexOf('e');
		int y=str.lastIndexOf('e',x-1);
		int z=str.lastIndexOf('e',y-1);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		}
}