import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SweetToothTests {

		/*Test for a return not null*/
		@Test
		void testProductNull() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertNotNull(p);
			
		}
		
		/*Checking Products for getting the menu number*/
		@Test
		void testProductMenuNumber() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getMenuNumber(), 1);
			
		}
		
		/*Checking Products for getting the name input*/
		@Test
		void testProductName() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getName(), "Vernor's Glazed");
			
		}
		
		/*Checking Products for getting the category input*/
		@Test
		void testProductCategory() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getCategory(), "Galzed Donuts");
			
		}
		
		/*Checking Products for getting the description input*/
		@Test
		void testProductDescription() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getDescription(), "Glaze");
			
		}
		
		/*Checking Products for getting the price input*/
		@Test
		void testProductPrice() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getPrice(), 1.50);
			
		}
		
		/*Checking Products for getting the amount input*/
		@Test
		void testProductAmount() {
			
			Products p = new Products(1, "Vernor's Glazed", "Glaze", "Galzed Donuts", 1.50, 500);
			assertEquals(p.getAmountOfProduct(), 500);
			
		}
		
		

	
	}

