package learnJava2025;

public class Pointclass {
	    private int x, y;
	    public Pointclass() {
	        this(0, 0);
	    }
	    public Pointclass(int x) {
	        this(x, x);
	    }
	    public Pointclass(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public void printPointclass() {
	        System.out.println("(" + x + ", " + y + ")");
	    }
	    public static void main(String[] args) {
	        Pointclass p1 = new Pointclass();        // → (0,0)
	        Pointclass p2 = new Pointclass(5);       // → (5,5)
	        Pointclass p3 = new Pointclass(3, 7);    // → (3,7)
	        p1.printPointclass();
	        p2.printPointclass();
	        p3.printPointclass();
	    }
	}


