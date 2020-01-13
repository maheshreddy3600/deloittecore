package deloittecore;

public class Bus implements Vehicle {

	public static void main(String[] args) {
		Vehicle bus = new Bus();
		bus.engines();
		bus.wheels();

	}

	@Override
	public void wheels() {
		System.out.println("number of wheels present are 6");
		
	}

	@Override
	public void engines() {
		System.out.println("1 engine");
		
	}

}
