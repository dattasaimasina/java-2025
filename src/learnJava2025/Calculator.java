package learnJava2025;

public class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }
	    public double add(double a, double b) {
	        return a + b;
	    }
	    public int add(int a, int b, int c,int d) {
	        return a + b + c+ d;
	    }
	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        System.out.println("add(int, int): " + calc.add(10, 20));
	        System.out.println("add(double, double): " + calc.add(5.5, 7.5));
	        System.out.println("add(int, int, int): " + calc.add(1, 2, 3, 6));
	    }
}
