class Nestedelseif1{
public static void main(String[] args){
	double accBal=1000.0;
	int amt=130;
	if(amt<=accBal){
		if(amt%100==0){
			
		System.out.println("withdrawal success");
		}
		else{
		System.out.println("invalid denomination");
		}
	}
else {
System.out.println("insufficient balance");
}
}
}	