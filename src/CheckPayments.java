
public class CheckPayments extends Payments {
	
	

	//fields
	private int checkNumber;

	public CheckPayments(double subTotal, double taxRate, double total) {
	super(subTotal, taxRate, total);
	this.checkNumber = checkNumber;
	
	
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	
}