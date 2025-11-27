package learnJava2025;

public class Stopwatch {
	    private long startTime;
	    private long endTime;
	    private boolean running;
	    
	    public void start() {
	        if (running) {
	            System.out.println("Error: Stopwatch is already running.");
	            return;
	        }
	        running = true;
	        startTime = System.currentTimeMillis();
	        System.out.println("Stopwatch started.");
	    }
	    public void stop() {
	        if (!running) {
	            System.out.println("Error: Cannot stop. Stopwatch hasn't started yet.");
	            return;
	        }
	        endTime = System.currentTimeMillis();
	        running = false;
	        System.out.println("Stopwatch stopped.");
	    }
	    public long elapsedMillis() {
	        if (running) {
	            System.out.println("Error: Stopwatch is still running. Stop it first.");
	            return -1;
	        }
	        if (startTime == 0 && endTime == 0) {
	            System.out.println("Error: Stopwatch hasn't been used yet.");
	            return -1;
	        }
	        return endTime - startTime;
	    }
	    public static void main(String[] args) throws InterruptedException {
	        Stopwatch sw = new Stopwatch();
	        sw.stop();        
	        sw.start();
	        Thread.sleep(500);
	        sw.start();       
	        sw.stop();
	        System.out.println("Elapsed: " + sw.elapsedMillis() + " ms");
	    }
	}