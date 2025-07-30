class Smallest{
	public static void main(String[] args){
		int[] arr={14,11,13,24,35,65};
		int large=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>large){
				large=arr[i];
			}
		}
			System.out.println(large);
	}
	
}
		