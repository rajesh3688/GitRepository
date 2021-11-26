package JavaBasics;

public class StaticCarmethods {
	
	
	//method hiding
	public static void start()
	{
		System.out.println("car-start");
	}
	
	public static void start(int a)
	{
		System.out.println("car-start");
	}
	
	public static void start(int a,int b)
	{
		System.out.println("car-start");
	}
		
	
	public void stop()
	{
		System.out.println("car-stop");
	}
	
	public void refuel()
	{
		System.out.println("car-refuel");
	}

}
