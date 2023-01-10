import java.util.ArrayList;

public class Products {
	
	//Fields
	private String name;
	private String description;
	private String category;
	private double price;
	//size
	private int amountOfProduct;
	private int menuNumber; // (Choose by number)
	
	//Constructor
	
	public Products(int menuNumber, String name, String description, String category, double price, int amountOfProduct) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.amountOfProduct = amountOfProduct;
	}
	
	
	
	//ArrayList method that stores products
	public static  ArrayList<Products> productList() {
		Products vGlazed = new Products(1, "Vernor's", "Cake with Vernor's glaze", "donuts", 1.50, 50);
		Products cream = new Products(2, "Detroit Cream", "Our local take on the Boston cream", "donuts", 1.50, 50);
		Products powdered = new Products(3, "Powdered", "Cake with powdered sugar", "donuts", 1.50, 40);
		Products blueberry = new Products(4, "Blueberry", "Cake with real blueberries", "donut", 1.50, 60);
		Products birthdayCake = new Products(5, "Birthday Cake", "Cake with Birthday sprinkles and frosting", "speciality donut", 1.60, 40);
		Products sCoffee = new Products(6, "Coffee", "plain black coffee", "beverage", 2.50, 100);
		Products lCoffee = new Products (7, "Coffee", "plain black coffee", "beverage", 3.50, 100);
		Products sLatte = new Products (8, "Latte", "expresso with milk and flavored syrup", "beverage", 3.00, 100 );
		Products lLatte = new Products (9, "Latte", "expresso with milk and flavored syrup", "beverage", 4.00, 100);
		Products sCappuccino = new Products (10, "Cappuccino", "expresso with steamed milk and foam", "beverage", 3.00, 100);
		Products lCappuccino = new Products (11, "Cappuccino", "experesso with steamed milk and foam", "beverage", 4.00, 100);
		Products sMocha = new Products (12, "Mocha", "expresso with steamed milk and chocolate", "beverage", 3.00, 100);
		Products lMocha = new Products (13, "Mocha", "expresso with steamed milk and chocolate", "beverage", 4.00, 100);
				
		
		return null;
	}
	//Getter / Setter 



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getAmountOfProduct() {
		return amountOfProduct;
	}



	public void setAmountOfProduct(int amountOfProduct) {
		this.amountOfProduct = amountOfProduct;
	}
	

}
