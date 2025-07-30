class Program7{
	public static void main(String[] args){
		String str="I Love Coding";
		char[] ch=str.toCharArray();
		str="";
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
			str=str+ch[i];
			}
		}
		System.out.println(str);
	}
}