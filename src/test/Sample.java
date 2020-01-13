package test;

import deloittecore.Arithmetic;

public class Sample implements Arithmetic {

	public static void main(String[] args) {
		System.out.println("sample");
		 Arithmetic arithmetic = new Sample();
		 arithmetic.output();
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
