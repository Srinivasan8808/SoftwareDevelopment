class Star3{
	public static void main(String[] args){
		int n=5;
		char val='a';
		
		for(int i=0;i<n;i++){
		System.out.print(val+" ");
			if(i<n/2){
				val++;
			}
			else{
				val--;
			}
		}
	}
}