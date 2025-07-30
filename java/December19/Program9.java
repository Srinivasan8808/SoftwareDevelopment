class Program9{
	public static void main(String[] args){
		int[] arr={13,11,14,17,15};
		int smallest=arr[0];
		
		for(int i=1;i<=arr.length-1;i++){
			if(arr[i]<smallest){
				smallest=arr[i];
		}
	}
	System.out.print("smallest is : "+smallest);
}
}