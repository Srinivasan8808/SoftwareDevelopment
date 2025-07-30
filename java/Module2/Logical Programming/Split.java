class Split{
	public static void main(String[] args){
		String[] alphabets;
		alphabets=new String[4];
		alphabets[0]="Jj";
		alphabets[1]="Aa";
		alphabets[2]="Vv";
		alphabets[3]="Aa";
		System.out.println("Elements of the String Type Array");
		System.out.println("-----------------------");
		for(int i=0;i<alphabets.length;i++){
			System.out.println(alphabets[i]);
		}
			System.out.println();
		char[] upperCaseAlphabets;
		upperCaseAlphabets=new char[alphabets.length];
		for(int i=0;i<alphabets.length;i++){
			upperCaseAlphabets[i]=alphabets[i].charAt(0);
		}
		for(int i=0;i<alphabets.length;i++){
			System.out.println(upperCaseAlphabets[i]);
		}
		System.out.println();
		char[] lowerCaseAlphabets;
		lowerCaseAlphabets=new char[alphabets.length];
		for(int i=0;i<alphabets.length;i++){
			lowerCaseAlphabets[i]=alphabets[i].charAt(1);
		}
		for(int i=0;i<alphabets.length;i++){
			System.out.println(lowerCaseAlphabets[i]);
		}
	}
}