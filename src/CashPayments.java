
public class CashPayments extends Payments{
	//Fields
	private double amountTender;
	private double changeDue;

	//Constructor
	public CashPayments(double subTotal, double taxRate, double total) {
		super(subTotal, taxRate, total);
		this.amountTender = amountTender;
		this.changeDue = changeDue;
		
	}
	
	//Methods
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	
	public double changeBack(double amountTender) {
		changeDue = amountTender - getTotal();
		return changeDue;
		
	}

	public double getAmountTender() {
		return amountTender;
	}

	public void setAmountTender(double amountTender) {
		this.amountTender = amountTender;
	}

	public double getChangeDue() {
		return changeDue;
	}

	public void setChangeDue(double changeDue) {
		this.changeDue = changeDue;
	}

	@Override
	protected void printReceipt() {
		// TODO Auto-generated method stub
		
	}

	

}
