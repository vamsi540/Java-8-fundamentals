<<<<<<< HEAD
package lamdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda {
		  public static void main(String[] args) {
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    Consumer<Integer> method = (n) -> { System.out.println(n); };
		    numbers.forEach( method );
		  }
		}


=======
package lamdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda {
		  public static void main(String[] args) {
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    Consumer<Integer> method = (n) -> { System.out.println(n); };
		    numbers.forEach( method );
		  }
		}


>>>>>>> 5ba0185ccab11fc186042f1f28b523ef0256359a
