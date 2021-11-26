
public class BMW implements Car {

	@Override
	public void start() {
     System.out.println("BMW-start");

		
	}

	@Override
	public void stop() {
		System.out.println("BMW-stop");
		
	}
	
	public void refuel()
	{
		System.out.println("BMW-refuel");
	}

}
