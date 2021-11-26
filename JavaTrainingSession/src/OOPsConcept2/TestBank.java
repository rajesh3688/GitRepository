package OOPsConcept2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.trnsfrmoney();
		hs.eduloan();
		hs.carloan();
		
		//dynamic polymorphism
		USBank us=new HSBCBank();//child class object can be referred by parent interface reference variable
		us.credit();//only overriden methods will be called
		us.debit();
		us.trnsfrmoney();
		
		System.out.println(USBank.bal);
		
		

	}

}
