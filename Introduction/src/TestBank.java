
public class TestBank {

	public static void main(String[] args) {


		HdfcBank hd=new HdfcBank();
		hd.loan();
		hd.credit();
		hd.debit();
		hd.carloan();
		
		Bank b=new HdfcBank();
		b.credit();
		b.debit();
		b.loan();
		
		

	}

}
