class Merge{
	public static void main(String[] args){
		char[] upperCaseAlphabets;
		upperCaseAlphabets=new char[4];
		upperCaseAlphabets[0]='J';
		upperCaseAlphabets[1]='A';
		upperCaseAlphabets[2]='V';
		upperCaseAlphabets[3]='A';
		for(int i=0;i< upperCaseAlphabets.length;i++){
			System.out.println(upperCaseAlphabets[i]);
		}
		System.out.println("------------------");
		char[] lowerCaseAlphabets;
		lowerCaseAlphabets=new char[4];
		lowerCaseAlphabets[0]='j';
		lowerCaseAlphabets[1]='a';
		lowerCaseAlphabets[2]='v';
		lowerCaseAlphabets[3]='a';
		for(int i=0;i< lowerCaseAlphabets.length;i++){
			System.out.println(lowerCaseAlphabets[i]);
		}
		System.out.println("------------------");
		String[] alphabets;
		alphabets=new String[upperCaseAlphabets.length];
		for(int i=0;i<alphabets.length;i++){
			alphabets[i]=upperCaseAlphabets[i]+""+lowerCaseAlphabets[i];
		}
		System.out.println("Elements of the String Type Array");
		System.out.println("------------------");
		for(int i=0;i<alphabets.length;i++){
			System.out.println(alphabets[i]);
		}
	}
}