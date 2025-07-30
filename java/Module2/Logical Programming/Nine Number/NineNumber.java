class NineNumber{
	public static void isNineOrNot(int num){
		int count=0;
		for(int i=1;i<=10;i++){
			if((Test.sum((num*i))==9)){
				count++;
			}
		}
		if((count==10)){
			System.out.println(num+"is a Nine Number");
		}
		else{
			System.out.println(num+"is a non Nine Number");
		}
	}
}