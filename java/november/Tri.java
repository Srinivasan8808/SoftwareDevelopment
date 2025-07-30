class Tri{
	public static void main(String[] args){
		int n=5;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(i==0 || j==0 || i==n/2 || (i==0 && j!=0) || (j==0 && i!=0))
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}

