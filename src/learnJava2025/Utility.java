package learnJava2025;

public class Utility {
	    private Utility() {
	    }
	    public static int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	    public static int min(int a, int b) {
	        return (a < b) ? a : b;
	    }
	    public static double avg(int a, int b) {
	        return (a + b) / 2.0;
	    }
	    public static void main(String[] args) {
	        System.out.println("Max: " + Utility.max(10, 20));
	        System.out.println("Min: " + Utility.min(10, 20));
	        System.out.println("Avg: " + Utility.avg(10, 20));
	    }
	}

