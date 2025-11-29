package learnJava2025;

public class FuelTracker {
	    private double liters;
	    private double distanceKm;
	    public FuelTracker() {
	        this.liters = 0;
	        this.distanceKm = 0;
	    }
	    private void setLiters(double liters) {
	        if (liters < 0) {
	            System.out.println("Invalid liters! Blocking negative input.");
	            return;
	        }
	        this.liters += liters;    
	    }
	    private void setDistanceKm(double km) {
	        if (km < 0) {
	            System.out.println("Invalid distance! Blocking negative input.");
	            return;
	        }
	        this.distanceKm += km;    
	    }
	    public void addTrip(double liters, double km) {
	        setLiters(liters);        
	        setDistanceKm(km);      
	        System.out.println("Trip added: " + liters + " L, " + km + " km");
	    }
	    public double averageKmpl() {
	        if (liters == 0) {
	            System.out.println("No fuel recorded! Cannot compute average.");
	            return 0;
	        }
	        return distanceKm / liters;
	    }
	    public static void main(String[] args) {
	        FuelTracker ft = new FuelTracker();

	        ft.addTrip(5, 60);
	        ft.addTrip(3, 50);
	        ft.addTrip(-2, 20);  // blocked

	        System.out.println("Average KMPL = " + ft.averageKmpl());
	    }
}
