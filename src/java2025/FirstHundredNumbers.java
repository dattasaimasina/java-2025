package java2025;
//import java.util.Scanner;

public class FirstHundredNumbers {

//	public static void main(String[] args) {
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
		
//		  Scanner sc = new Scanner (System.in);
//	        
//	        System.out.print("Enter a number: ");
//	        int n = sc.nextInt();  
//	        
//	        long product = 1;  
//	        
//	        for (int i = 1; i <= n; i++) {
//	            product *= i; 
//	        }
//	        
//	        System.out.println("Product of numbers from 1 to " + n + " is: " + product);
//	        
//	        sc.close();
		
//		Using Break in a Loop
		
//		for (int i = 1; i<=5; i++) {
//		if (i == 4) {
//			break;
//		}
//			System.out.println(i);
		
		
		
//		Using continue in a Loop
		
//		for (int i = 1; i<=10; i++) {
//			
//		
//			System.out.println(i);
//			System.out.println(i);
//			if (i == 6) {
//				continue;
//			}
//			System.out.println(i);
//	
			
			
//		FOR-EACH LOOP
//		int[] numbers = {10,20,30,40,50,60};
//		for (int num : numbers) {
//			System.out.println(num);
		
//		PRINT EVEN NUMBERS USING FOR IF
		
//		for (int i=1; i<=100; i++) {
//		if (i % 2 == 0) {
//			System.out.println(i);
		
		
//	PRINT MULTIPLES OF 3 OR 5
		
//		for (int i=1; i<=30; i++) {
//			if (i % 3 ==0) {
//				System.out.println(i + "");
		
//				for (int i = 1; i<=50; i++) {
//					if (i % 3 ==0 || i % 5 == 0) {
//						System.out.println(i + " ");
//		int n = 4;
//		for (int i = 1; i<=n; i++) {
//			for (int j = 1; j<=i; j++) {
//				System.out.println("*");
		
//		print  numbers using FOR and WHILE
		
//		for (int i=1; i<=100; i++) {
//			System.out.println(i);
			
//			int i = 1;
//			while (i <= 100) {
//				System.out.println(i);
//				i++;
			
//		print even numbers using FOR and WHILE
		
//				for (int i=1; i<=100; i++) {
//					if (i % 2 ==0) {
//					System.out.println(i);
					
//					int i = 1;
//					while (i <= 100){
//						if (i % 2 == 0) {
//							System.out.println(i + " ");
//						}
//							i++;
							
//							print sum of numbers 1 to 100 using for and while
							
//							int sum = 0;
//							for (int i = 1; i <= 100; i++) {
//								sum = sum + i;
//							}
//								System.out.println(sum);
//					int sum = 0;
//							int i = 1;
//							while (i<=100) {
//								sum = sum + i;
//							
//							i++;
//							}
//							System.out.println(sum);
		
//		print numbers 100 to 1 in reverse by using FOR and WHILE
		
//		for (int i = 100; i >=1; i--) {
//			System.out.println(i);
			
//			int i = 100;
//			while (i >= 1) {
//				System.out.println(i);
//
//			i--;
		
//		using conditional inside loop
		
		
//		int evenCount=0;
//		int oddCount = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "-is even number");
//		evenCount++;
//			} else {
//				oddCount++;
//				System.out.println(i + "-is odd number");
		
		
		
//		using break and continue 
		
//		for (int i = 1; i <=10; i++) {
//			
//			if (i == 5) {
//			continue;
//			}
//			if (i == 8) {
//				break;
//				}
//			System.out.println(i);		
//		}
//	}
//}
			
	
//	ARRAYS
	
	
//			int[] numbers = {70,120,130,50,10};
//			int max = numbers[0];
//			for (int i = 1; i<numbers.length; i++) {
//				if (numbers [i] > max) {
//					max = numbers[i];
//				}
//				}
//			System.out.println(max);
//					
//				}
//			}

//			int[] numbers = {8,7,6,5,1,3,2};
//			int min = numbers[0];
//			for (int i = 1; i<numbers.length; i++) {
//				if (numbers[i] < min) {
//					min = numbers[i];
//				}
//			}
//			System.out.println(min);
//				}
//			}


//			PRINT AN ARRAY IN REVERSE ORDER 
		
//			int[] numbers = {50,40,30,20,10};
//			for (int i = numbers.length-1; i>=0; i--) {
//				System.out.println(numbers[i]);
		
		
//		int[] numbers = {10,20,25,39,50,71,83,75,94,98,100};
//		int evenCount = 0;
//		int oddCount = 0;
//		for (int num : numbers) {
//			if (num % 2 ==0) {
//				evenCount++;
//			}else {
//				oddCount++;
//			}
//		}
//				System.out.println("count of even numbers is : " + evenCount);
//
//				System.out.println("count of odd numbers is : " + oddCount);
		
		
//		int[] numbers = {10,20,30,40,50,60,70,80};
//		int  sum = 0;
//		double average;
//		for (int num : numbers) {
//			sum+=num;
//		}
//		average = (double) sum / numbers.length;
//		System.out.println(sum);
//		System.out.println(average);
		
		
		
//		int[] numbers = {10,30,50,70,90};
//		int key = 30;
//		boolean found = false;
//		for (int i = 1; i< numbers.length; i++) {
//			if (numbers[i] == key) {
//				System.out.println("element"  + key  +"found in index " + i);
//				found = true;
//				break;
//			}
//			
//		}
//		if (!found) {
//			System.out.println("element" + key + "not found in an array :");
		
//		}
//		}




//find sum of number using method and loop

//		public static int findSum(int n) {
//			int sum = 0;
//			for (int i=1; i<=n; i++) {
//				sum= sum+i;
//	}
//			return sum;
//}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int number = sc.nextInt();
//		int result = findSum(number);
//		System.out.println(number+result);
//		sc.close();
//		
	
	
	
	
//	write a method of max of two numbers
	
//	public static int findMax(int a , int b) {
////		int sum = 0;
//		if (a>b) {
//			return a;
//		}
//		else {
//			return b;
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number");
//		int num1 = sc.nextInt();
//		System.out.println("Enter Second Number");
//		int num2 = sc.nextInt();
//		int result = findMax(num1 , num2);
//		System.out.println("The Maximum number is - " + result);
//		sc.close();
	
	
	
//	write a method to check even/odd using if and return
	
//	public static String findEvenOdd(int num) {
//		if (num % 2 ==0) {
//			return "even";
//		}
//		else {
//			return "odd";
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int number = sc.nextInt();
//		String result = findEvenOdd(number);
//		System.out.println("The number " + number +  " is "  + result);
//		sc.close();
	
	
	
	
//	print multiplication table using loop & parameter
	
//	public static void printTable(int n){
//		System.out.println("Multiplication table of " + n + ":");
//		for (int i = 1; i<=10; i++) {
//			System.out.println(n + "x" + i + "=" + (n*i));	
//		}
//	    }
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int number = sc.nextInt();
//		printTable(number);
//		sc.close();
	
	
	
	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int[] reversed = new int[n];
		for (int i = 0; i<n; i++) {
			reversed [i] = arr[n-1-i];
		}
		return reversed;
	}
	public static void main(String[] args) {
		int[] numbers = {10,11,15,20,23};
		int[] result = reverseArray(numbers);
		System.out.println("Reversed array: ");
		for (int num : result) {
			System.out.println(num + " ");
		}
	}
}