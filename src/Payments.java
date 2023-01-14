import java.util.ArrayList;

public abstract class Payments {

	//Fields
	protected double subTotal;
	protected double taxRate;
	protected double total;
	
	public abstract void pay();

	
	//Constructor
	public Payments(double subTotal, double total) {
		super();
		this.subTotal = subTotal;
		this.taxRate = 0.06;
		this.total = total;
	}

	//getters / setters
	
	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public double getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	//protected abstract void printReceipt();



	protected void printReceipt() {
		// TODO Auto-generated method stub
		
	}




	
	//toString(?)
	
	
}



