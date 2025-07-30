class SquareCube{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		int[] square=new int[arr.length];
		int[] cube=new int[arr.length];
		System.out.println("elements of the array");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		for(int i=0;i<arr.length;i++){
			square[i]=arr[i]*arr[i];
			cube[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println("elements of the square array");
		for(int i=0;i<arr.length;i++){
			System.out.println(square[i]);
		}
		System.out.println("-------------");
		System.out.println("elements of the cube array");
		for(int i=0;i<arr.length;i++){
			System.out.println(cube[i]);
		}
	}
}