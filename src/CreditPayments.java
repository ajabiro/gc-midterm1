
public abstract class CreditPayments extends Payments{
	
	
	//fields
	private int creditCardNum;
	private int expDate;
	private int cvv;
	
	public CreditPayments(double subTotal, double taxRate, double total) {
	super(subTotal, taxRate, total);
	this.creditCardNum = creditCardNum;
	this.expDate = expDate;
	this.cvv = cvv;
	
	}
}