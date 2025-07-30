class Sorting{
	public static void main(String[] args){
		int[] arr={23,72,64,83,11,45};
		System.out.println("Before swapping");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("after swapping");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}