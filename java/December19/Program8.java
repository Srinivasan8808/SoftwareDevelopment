class Program8{
	public static void main(String[] args){
		int[] arr={13,11,14,17,15};
		int largest=arr[0];
		
		for(int i=1;i<=arr.length-1;i++){
			if(arr[i]>largest){
				largest=arr[i];
		}
	}
	System.out.print("largest is : "+largest);
}
}