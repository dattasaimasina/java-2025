package learnJava2025;

public class Student {
	    private String name;
	    private Address address;

	    public Student(String name, Address address) {
	        this.name = name;
	        this.address = address;
	    }
	    public void printDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("City        : " + address.city);
	        System.out.println("Pincode     : " + address.pin);
	    }
	    public static void main(String[] args) {

	        Address addr = new Address("Hyderabad", 500001);
	        Student s = new Student("Ravi", addr);

	        s.printDetails();
	    }
	}
	class Address {
	    String city;
	    int pin;
	    public Address(String city, int pin) {
	        this.city = city;
	        this.pin = pin;
	    }
	}
	