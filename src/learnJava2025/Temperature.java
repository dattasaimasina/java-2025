package learnJava2025;

public class Temperature {
	    private double celsius; 
	    public Temperature(double celsius) {
	        setCelsius(celsius);
	    }
	    public void setCelsius(double celsius) {
	        if (celsius > -273.15) {
	            this.celsius = celsius;
	        } else {
	            System.out.println("Invalid temperature! Setting to -273.15 (absolute zero).");
	            this.celsius = -273.15;
	        }
	    }
	    public double getCelsius() {
	        return celsius;
	    }
	    public double toFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }
	    public double toKelvin() {
	        return celsius + 273.15;
	    }
	    public static void main(String[] args) {
	        Temperature t1 = new Temperature(25);
	        System.out.println("Celsius: " + t1.getCelsius());
	        System.out.println("Fahrenheit: " + t1.toFahrenheit());
	        System.out.println("Kelvin: " + t1.toKelvin());

	        Temperature t2 = new Temperature(-300);
	        System.out.println("Celsius: " + t2.getCelsius());
	    }
	}