package deloittecore;

public class Aeroplane implements Vehicle {

	public static void main(String[] args) {
		Vehicle aeroplane = new Aeroplane();
		aeroplane.engines();
		aeroplane.wheels();
	}

	@Override
	public void wheels() {
		System.out.println("number of wheels present are 10");
		
	}

	@Override
	public void engines() {
		System.out.println("4 engine");
		
	}

}
