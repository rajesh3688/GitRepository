package OOPsConcept2;

public class HSBCBank implements USBank,BrazilBank //we are achieving multiple inheritance
//is-a relationship
{

	//if a class is implementing an interface then it is mandatory to define/override all the methods of interface
	@Override//USBank methods
	public void credit() {
		System.out.println("HSBC-credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC-debit");
		
	}

	@Override
	public void trnsfrmoney() {
		System.out.println("HSBC-trnsfr");
		
	}
	
	//HSBCBank method
	public void eduloan()
	{
		System.out.println("hsbc-eduloan");
	}
	
	
	public void carloan()
	{
		System.out.println("hsbc-carloan");
	}

	@Override//Brazil Bank method
	public void mutualfunds() {

        System.out.println("Brazil-funds");
		
	}

}
