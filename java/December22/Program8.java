class Program8{
	public static void main(String[] args){
		String str="I Love Coding & JavaSE8";
		char[] ch=str.toCharArray();
		str="";
		
		for(int i=0;i<ch.length;i++){
			if((ch[i]>='A' && ch[i]<='Z')==false){
			str=str+ch[i];
			}
		}
		System.out.println(str);
	}
}