package deloittecore;

public interface Arithmetic { //Functional interface (only one abstract method)

	int add(int x, int y);
	default void output(){
		System.out.println("It is default method");
	}
}
