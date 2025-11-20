package learnJava2025;

public class StudentMarks {
	public int m1,m2,m3;
	
	public StudentMarks(int m1,int m2,int m3) {
		if (isValid (m1) && isValid(m2) && isValid(m3)) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		}else {
			System.out.println("Invalid marks entered! Setting all marks to 0");
			this.m1 = this.m2 = this.m3 = 0;
		}
	}
	public boolean isValid(int mark) {
		return mark >= 0 && mark <= 100;
	}
	 public double average() {
		 return (m1 + m2 +m3) /3.0;
	 }
	 public void printreport() {
		 System.out.println("________Student Report________");
		 System.out.println("Mark 1: " + m1);
		 System.out.println("Mark 2: " + m2);
		 System.out.println("Mark 3: " + m3);
		 System.out.println("Average: " + average());
	 }
	 public static void main(String[] args) {
		StudentMarks s = new StudentMarks(85,90,110);
		s.printreport();
	}
}
