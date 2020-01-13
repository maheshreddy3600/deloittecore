package deloittecore;

public class ArthmeticApplication {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = (x,y)->{  // lambda expression 
			System.out.println("add method");
			return x+y;
		};

		System.out.println(arithmetic.add(10,20));
		arithmetic.output();
	}

}
