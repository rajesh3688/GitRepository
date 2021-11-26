package OOPsConcept2;

public interface USBank {
	
	int bal=100;//variables are by default static in nature-cannot be changed
	
	public void credit();
	
	public void debit();
	
	public void trnsfrmoney();
	
	//no main method
	//no static methods are allowed 
	//interface is abstract in nature-cannot create object of interface
	//cannot change values of variables-final/constant
	//only method declaration-no mehtod body
	

}
