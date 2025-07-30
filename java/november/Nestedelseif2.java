class Nestedelseif2{
public static void main(String[] args){
  char gender='m';
  int age=16;
  if(gender=='m')
  {
	  if(age>=21){
		  System.out.println("eligible bachelor");
	  }
	  else{
		  System.out.println("underage");
	  }
  }
  else if(gender=='f'){
	  if(age>=18){
	  System.out.println("eligible spinster");
	  }
	  else{
		  System.out.println("underage");
	  }
  }
}
}

	  
		  