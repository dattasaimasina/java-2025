package learnJava2025;

public class Device {
	    private boolean on;   
	    public Device() {
	        this.on = false;
	    }
	    public void turnOn() {
	        if (!on) {
	            on = true;
	            System.out.println("Device turned ON.");
	        } else {
	            System.out.println("Device is already ON.");
	        }
	    }
	    public void turnOff() {
	        if (on) {
	            on = false;
	            System.out.println("Device turned OFF.");
	        } else {
	            System.out.println("Device is already OFF.");
	        }
	    }
	    public void toggle() {
	        on = !on;
	        System.out.println("Device toggled. Now it is " + (on ? "ON" : "OFF") + ".");
	    }
	    public boolean isOn() {
	        return on;
	    }
	    public static void main(String[] args) {
	        Device d = new Device();
	        d.turnOn();
	        d.turnOff();
	        d.toggle();
	        d.toggle();
	        System.out.println("Final State: " + (d.isOn() ? "ON" : "OFF"));
	    }
	}
