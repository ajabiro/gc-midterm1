import java.util.ArrayList;

public class Products {
	
	//Fields
	private String name;
	private String description;
	private String category;
	private double price;
	//size
	private int amountOfProduct;
	//menuNumber (Choose by number)
	
	//Constructor
	
	public Products(String name, String description, String category, double price, int amountOfProduct) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.amountOfProduct = amountOfProduct;
	}
	
	
	
	//ArrayList method that stores products
	public static  ArrayList<Products> productList() {
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
