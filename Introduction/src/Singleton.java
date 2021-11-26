
public class Singleton {

	//In OOP singleton class is a class that have only one object(instance of class)at a time
	//how to design singleton class
	//make constructor as private
	//write a public static method that has return type of object of this singleton class(lazy initialization)
	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		str="hey i am using singleton class";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance==null)
			singleton_instance=new Singleton();
			return singleton_instance;	
				
	}
	
	public static void main(String args[])
	{
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
	 
}
