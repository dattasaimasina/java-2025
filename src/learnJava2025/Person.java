package learnJava2025;

public class Person {
	    private static int counter = 0;   
	    private int id;                   
	    private String name;
	    public Person(String name) {
	        counter++;       
	        this.id = counter;
	        this.name = name;
	    }
	    public void printPerson() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }
	    public static void main(String[] args) {
	        Person p1 = new Person("Ravi");
	        Person p2 = new Person("Teja");
	        Person p3 = new Person("Meena");
	        p1.printPerson();
	        p2.printPerson();
	        p3.printPerson();
	    }
	}



