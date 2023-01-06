
public abstract class Payments {

	//Fields
	private double subTotal;
	private double taxRate = .06;
	private double total;
	
	public abstract void pay();
	
	
	//Constructor
	public Payments(double subTotal, double taxRate, double total) {
		super();
		this.subTotal = subTotal;
		this.taxRate = taxRate;
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
	

	//toString(?)
	
	
}
