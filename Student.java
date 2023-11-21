package lamdaexpression;

public class Student {
	int number;
	String name;
	static String college;

	
	   Student( int number, String  name,String college){
		
		this.name=name;
		this.number=number;
		this.college=college;
	 }
	 void display() {
		 System.out.println(number+" "+name+" "+college);
	 }
		
		public static void main(String args[]) {
			Student e1=new Student(4404, "vignan", "vamsi");
			e1.display();
			
		


	}
}
	


