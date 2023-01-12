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
		this.menuNumber = menuNumber;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.amountOfProduct = amountOfProduct;
	}
	
	
	
	@Override
	public String toString() {
//		return "Products [name=" + name + ", description=" + description + ", category=" + category + ", price=" + price
//				+ ", amountOfProduct=" + amountOfProduct + ", menuNumber=" + menuNumber + ", getName()=" + getName()
//				+ ", getDescription()=" + getDescription() + ", getCategory()=" + getCategory() + ", getPrice()="
//				+ getPrice() + ", getAmountOfProduct()=" + getAmountOfProduct() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		
		return(getMenuNumber() + getName() + "," + getCategory() + getDescription() + "," + String.format("%.2f", getPrice()));
		
		
	}


	

	public int getMenuNumber() {
		return menuNumber;
	}



	public void setMenuNumber(int menuNumber) {
		this.menuNumber = menuNumber;
	}



	//ArrayList method that stores products
	public static  ArrayList<Products> productList() {
		ArrayList<Products> list = new ArrayList<>();
		Products vGlazed = new Products(1, "Vernor's" , " Cake with Vernor's glaze ", " donuts ", 1.50, 50);
		list.add(vGlazed);
		Products cream = new Products(2, " Detroit Cream ", " Our local take on the Boston cream ", " donuts ", 1.50, 50);
		list.add(cream);
		Products powdered = new Products(3, " Powdered", " Cake with powdered sugar", " donuts", 1.50, 40);
		list.add(powdered);
		Products blueberry = new Products(4, " Blueberry", " Cake with real blueberries", " donut", 1.50, 60);
		list.add(blueberry);
		Products birthdayCake = new Products(5, " Birthday Cake", " Cake with Birthday sprinkles and frosting", " speciality donut", 1.60, 40);
		list.add(birthdayCake);
		Products sCoffee = new Products(6, " Coffee", " plain black coffee", " beverage", 2.50, 100);
		list.add(sCoffee);
		Products lCoffee = new Products (7, " Coffee", " plain black coffee", " beverage", 3.50, 100);
		list.add(lCoffee);
		Products sLatte = new Products (8, " Latte", " espresso with milk and flavored syrup", " beverage", 3.00, 100 );
		list.add(sLatte);
		Products lLatte = new Products (9, " Latte", " espresso with milk and flavored syrup", " beverage", 4.00, 100);
		list.add(lLatte);
		Products sCappuccino = new Products (10, " Cappuccino", " espresso with steamed milk and foam", " beverage", 3.00, 100);
		list.add(sCappuccino);
		Products lCappuccino = new Products (11, " Cappuccino", " esperesso with steamed milk and foam", " beverage", 4.00, 100);
		list.add(lCappuccino);
		Products sMocha = new Products (12, "Mocha", " espresso with steamed milk and chocolate", " beverage", 3.00, 100);
		list.add(sMocha);
		Products lMocha = new Products (13, "Mocha", " espresso with steamed milk and chocolate", " beverage", 4.00, 100);
		list.add(lMocha);
		
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
			
		return list;
	}
	
	public void printList() {
		ArrayList<Products> list = new ArrayList<>();
		Products vGlazed = new Products(1, "Vernor's" , " Cake with Vernor's glaze ", " donuts ", 1.50, 50);
		list.add(vGlazed);
		Products cream = new Products(2, " Detroit Cream ", " Our local take on the Boston cream ", " donuts ", 1.50, 50);
		list.add(cream);
		Products powdered = new Products(3, " Powdered", " Cake with powdered sugar", " donuts", 1.50, 40);
		list.add(powdered);
		Products blueberry = new Products(4, " Blueberry", " Cake with real blueberries", " donut", 1.50, 60);
		list.add(blueberry);
		Products birthdayCake = new Products(5, " Birthday Cake", " Cake with Birthday sprinkles and frosting", " speciality donut", 1.60, 40);
		list.add(birthdayCake);
		Products sCoffee = new Products(6, " Coffee", " plain black coffee", " beverage", 2.50, 100);
		list.add(sCoffee);
		Products lCoffee = new Products (7, " Coffee", " plain black coffee", " beverage", 3.50, 100);
		list.add(lCoffee);
		Products sLatte = new Products (8, " Latte", " espresso with milk and flavored syrup", " beverage", 3.00, 100 );
		list.add(sLatte);
		Products lLatte = new Products (9, " Latte", " espresso with milk and flavored syrup", " beverage", 4.00, 100);
		list.add(lLatte);
		Products sCappuccino = new Products (10, " Cappuccino", " espresso with steamed milk and foam", " beverage", 3.00, 100);
		list.add(sCappuccino);
		Products lCappuccino = new Products (11, " Cappuccino", " esperesso with steamed milk and foam", " beverage", 4.00, 100);
		list.add(lCappuccino);
		Products sMocha = new Products (12, "Mocha", " espresso with steamed milk and chocolate", " beverage", 3.00, 100);
		list.add(sMocha);
		Products lMocha = new Products (13, "Mocha", " espresso with steamed milk and chocolate", " beverage", 4.00, 100);
		list.add(lMocha);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
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
