package Listconcept;

public class FinalizeConcept {

	public static void main(String[] args) {

		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();

		f1=null;
		f2=null;
		
		System.gc();
	}
	
	//finalize is a method
	public void finalize()
	{
		System.out.println("inside finalize");
	}

}
