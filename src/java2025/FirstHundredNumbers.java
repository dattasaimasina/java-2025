package java2025;
import java.util.Scanner;

public class FirstHundredNumbers {

	public static void main(String[] args) {
//		for (int i =1; i <=100; i++) {
//			System.out.println(i);
		
//			for (int i =1; i<=100; i++) {
//			int evenNumber = i*2;
//			System.out.println(evenNumber);
//		
//			for (int i=1; i<=100; i++){
//			if (i % 2 !=0) {
//			System.out.println(i);
		
//		for (int i=100; i>=1; i--) {
//		System.out.println(i);
		
//		for (int i=1; i<=100; i+=3) {
//			System.out.println(i);
		
//		for (int i=100; i>=1; i-=5) {
//			System.out.println(i);
		
//		int evenCount = 0;
//		int oddCount =0;
//		
//		for (int i=1; i<=270; i++) {
//			if (i % 2 ==0) {
//				evenCount++;
//			}
//			else {oddCount++;
//			}
//		}
//	System.out.println("count of evenNumbers" + evenCount);
//	System.out.println("count of oddNumbers" + oddCount);
		
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();  // Read user input
	        
	        long product = 1;  // Start with 1 because multiplying by 0 gives 0
	        
	        for (int i = 1; i <= n; i++) {
	            product *= i;  // Multiply each number from 1 to n
	        }
	        
	        System.out.println("Product of numbers from 1 to " + n + " is: " + product);
	        
	        sc.close();
		
	
	
       

//			}
		
//		}

	}

}
