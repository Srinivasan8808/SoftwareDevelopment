class ArrayToString{
	public static void main(String[] args){
		char[] array={'j','a','v','a'};
		System.out.println("elements of the array");
		System.out.println("------------");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
		String str;
		str = new String(array);
		System.out.println("String representation");
		System.out.println("-------------------");
		System.out.println(str);
		}
}
		