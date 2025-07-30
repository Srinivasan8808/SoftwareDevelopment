class StringToArray{
	public static void main(String[] args){
		String string;
		string="java";
		System.out.println("elements of the array");
		System.out.println("------------");
		System.out.println(string);
		System.out.println();
		char[] array;
		array=string.toCharArray();
		System.out.println("Elements of the Character type array");
		for(char c : array){
			System.out.println(c);
		}
		}
}
		