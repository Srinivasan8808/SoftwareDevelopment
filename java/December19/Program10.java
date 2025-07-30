class Program10{
	public static void main(String[] args){
		int[] arr={13,11,14,17,15};
		int val=17;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++){
			if(val==arr[i]){
				System.out.println("value is found:"+i);
				flag=true;
		}
	}
	if(flag==false){
	System.out.print("vale is not found ");
}
	}
}