package learnJava2025;

public class Product {

	    private String name;
	    private double price;
	    private int stock;

	    Product(String name, double price, int stock) {
	        this.name = name;
	        this.price = price;
	        this.stock = Math.max(stock, 0); 
	    }
	    public void restock(int amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid restock amount.");
	            return;
	        }
	        stock += amount;
	        System.out.println(amount + " units added. New stock: " + stock);
	    }
	    public void sell(int amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid sell amount.");
	            return;
	        }
	        if (amount > stock) {
	            System.out.println("Cannot sell " + amount + " units. Only " + stock + " available.");
	            return;
	        }
	        stock -= amount;
	        System.out.println("Sold " + amount + " units. Remaining stock: " + stock);
	    }
	    public double valueInStock() {
	        return stock * price;
	    }
	    public static void main(String[] args) {
	        Product p = new Product("Laptop", 50000, 10);
	        p.sell(3);
	        p.restock(5);
	        p.sell(20);  
	        System.out.println("Total stock value = ₹" + p.valueInStock());
	    }
	}
