package lamdaexpression;

 class student {
	int number;
	String name;
	
  student(int i,String n){
	  number=i;
	  name=n;
	  
	  
		
	}
  
  student(student t){
	  number =t.number;
	  name=t.name;
	  
  }
  
 

	void display() {
		System.out.println(number+ " "+name);
	}
}
