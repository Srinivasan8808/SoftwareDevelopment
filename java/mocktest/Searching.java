class Searching{
	public static void main(String[] args){
		int[] arr={12,14,21,54};
		int a=111;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==a){
				System.out.println("number found");
				flag=true;
			}
		}
				if(flag==false){
				System.out.println("not found");
			}

	}
}