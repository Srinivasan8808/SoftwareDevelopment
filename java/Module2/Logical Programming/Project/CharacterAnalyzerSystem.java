Class CharacterAnalyzerSystem{
	public static void character(char c){
		if((c>='0') && (c<='9')){
			System.out.println(c+"is a Digit");
		}
		else if((c>='A') && (c<='Z')){
			if((c=='A') || (c=='E') || (c=='I') || (c=='O') || (c=='Z'){
			System.out.println(c+"is an Uppercase vowel ");
			}
			else{
				System.out.println(c+"is an Uppercase Consonant");
			}
		}
		else if((c>='a') && (c<='z')){
			if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='z'){
			System.out.println(c+"is an Lowercase vowel ");
			}
			else{
				System.out.println(c+"is an Lowercase Consonant");
			}
		}
		else{
			System.out.println(c+"is a symbol");
		}
	}
}