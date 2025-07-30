class Control5{
	public static void main(String[] args){
		double cgpa=8.18;
		if(cgpa>=8.5){
			System.out.println("Distinction");
		}
		else if(cgpa<8.5 && cgpa>=7.5){
			System.out.println("First class");
		}
		else if(cgpa<7.5 && cgpa>=6.5){
			System.out.println("second class");
		}
		else if(cgpa<6.5 && cgpa>=5){
			System.out.println("average");
		}
		else{
			System.out.println("fail");
		}
	}
}