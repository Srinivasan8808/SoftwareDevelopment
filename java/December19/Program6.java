class Program6{
	public static void main(String[] args){
		int[] arr={13,11,14,17,15};
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++){
			sum=sum+arr[i];
		}
		System.out.print("sum is: "+sum);
	}
}