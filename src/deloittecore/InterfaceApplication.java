package deloittecore;

public class InterfaceApplication implements One,Two,Three {

	@Override
	public void methodthree() {
		System.out.println("This is method three");
	}

	@Override
	public void methodtwo() {
		System.out.println("This is method two");
		
	}

	@Override
	public void methodone() {
		System.out.println("This is method one");
		
	}
	public static void main(String[] args) {
		One one = new InterfaceApplication();
		one.methodone();
		Three three = new InterfaceApplication();
		three.methodthree();

	}

	

}
