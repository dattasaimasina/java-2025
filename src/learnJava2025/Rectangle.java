package learnJava2025;

public class Rectangle {
	int width;
	int height;
	
	Rectangle(){
		this.width = 1;
		this.height = 1;
	}
	Rectangle(int width , int height){
		this.width = width;
		this.height = height;
	}
	int area() {
		return width*height;
	}
	int perimeter() {
		return 2 * (width+height);
	}
	 public static void main(String[] args) {
	 Rectangle r1 = new Rectangle();
	 System.out.println("Area (default) " + r1.area());
	 System.out.println("Perimeter (default) " + r1.perimeter());
	 
	 Rectangle r2 = new Rectangle(5,7);
	 System.out.println("Area (5*7) " + r2.area());
	 System.out.println("Perimeter (5+7) " + r2.perimeter());
	 
	}
	

}
