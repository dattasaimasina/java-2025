package learnJava2025;

public class Book {
	
	    private String title;
	    private String author;
	    private double price;

	    public Book() {
	        this.title = "Unknown Title";
	        this.author = "Unknown Author";
	        this.price = 0.0;
	    }
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }
	    public String toString() {
	        return "Book Details:\n" +
	               "Title : " + title + "\n" +
	               "Author: " + author + "\n" +
	               "Price : ₹" + price;
	    }
	    public static void main(String[] args) {
	        Book b1 = new Book();
	        Book b2 = new Book("Java Programming", "James Gosling", 599);
	        System.out.println(b1);
	        System.out.println("------------------");
	        System.out.println(b2);
	    }
	}


