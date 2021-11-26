package OOPSConcept;

public class callbyvalvscallbyref {
	
	//global or class variables
	int p;
	int q;

	public static void main(String[] args) {
		
		callbyvalvscallbyref obj=new callbyvalvscallbyref();
		int d=obj.sum(2, 3);
		System.out.println(d);
		
		obj.p=50;
		obj.q=60;
		
		//before swapping
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj);
		
		//after swapping
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	//call by value
	public int sum(int x,int y)
	{
		int c=x+y;
		return c;
	}
	
	public void swap(callbyvalvscallbyref t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
}
