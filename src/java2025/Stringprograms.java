package java2025;
import java.util.Scanner;

public class Stringprograms {

//	public static void main(String[] args) {
//		String text = "Hello World";
//		for (int i =0; i< text.length();i++) {
//			System.out.println(text.charAt(i));
			
			
			
			
			
//	public static void main(String[] args) {
//        String str1 = " Hello";
//        String str2 = " World";
//        String result = str1 + str2;
//
//        System.out.println(result);
	
	
	
	
	
//	 public static void main(String[] args) {
//	        String text = "Java Programming";
//	        String upper = text.toUpperCase();
//	        String lower = text.toLowerCase();
//	        System.out.println("Uppercase: " + upper);
//	        System.out.println("Lowercase: " + lower);
	
	
	
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first string: ");
//        String str1 = sc.nextLine();
//
//        System.out.print("Enter second string: ");
//        String str2 = sc.nextLine();
//        if (str1.equals(str2)) {
//            System.out.println("Strings are equal (case-sensitive).");
//        } else {
//            System.out.println("Strings are NOT equal (case-sensitive).");
//        }
//        if (str1.equalsIgnoreCase(str2)) {
//            System.out.println("Strings are equal (case-insensitive).");
//        } else {
//            System.out.println("Strings are NOT equal (case-insensitive).");
//        }
//
//        sc.close();
	
	
	
	
	
	
//    public static void main(String[] args) {
//        String str = "JavaProgramming";
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed = reversed + str.charAt(i);
//        }
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reversed);
	
	
	
	
//	 public static void main(String[] args) {
//	        String str = "HelloWorld";
//	        int vowels = 0, consonants = 0;
//	        str = str.toLowerCase();
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i);
//	            if (ch >= 'a' && ch <= 'z') {
//	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//	                    vowels++;
//	                else
//	                    consonants++;
//	            }
//	        }
//	        System.out.println("Vowels: " + vowels);
//	        System.out.println("Consonants: " + consonants);
	
	
	
	
	
//	 public static void main(String[] args) {
//	        String str = "madam";
//	        String reversed = "";
//	        for (int i = str.length() - 1; i >= 0; i--) {
//	            reversed = reversed + str.charAt(i);
//	        }
//	        if (str.equals(reversed)) {
//	            System.out.println(str + " is a Palindrome");
//	        } else {
//	            System.out.println(str + " is NOT a Palindrome");
	
	
	
	
	
	
//	 public static void main(String[] args) {
//	        String str = "Hello World";
//	        String result = "";
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i);
//	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//	                result = result + '*';
//	            } else {
//	                result = result + ch;
//	            }
//	        }
//	        System.out.println("Original String: " + str);
//	        System.out.println("String after replacing vowels: " + result);

	
	        
	        
	        

//	    public static void main(String[] args) {
//	        String str = "JavaProgramming";
//	        String sub = str.substring(4, 11);
//	        System.out.println("Original String: " + str);
//	        System.out.println("Extracted Substring: " + sub);
	
	
	
	
	
//	    public static void main(String[] args) {
//	        String str = "JavaProgramming";
//	        char firstChar = str.charAt(0);
//	        char lastChar = str.charAt(str.length() - 1);
//	        System.out.println("First Character: " + firstChar);
//	        System.out.println("Last Character: " + lastChar);
	
	
	
	
//	    public static void main(String[] args) {
//	        String str = "JavaProgramming";
//	        boolean starts = str.startsWith("Java");
//	        boolean ends = str.endsWith("ming");
//	        System.out.println("Starts with 'Java'? " + starts);
//	        System.out.println("Ends with 'ming'? " + ends);
	
	
	
	

//	    public static void main(String[] args) {
//	        String str = "Java Programming Language";
//	        String result = str.replace(" ", "");
//	        System.out.println("Original: " + str);
//	        System.out.println("Without spaces: " + result);
	
	
	
	
	
//	    public static void main(String[] args) {
//	        StringBuilder sb = new StringBuilder();
//	        sb.append("OpenAI ");
//	        sb.append("ChatGPT");
//	        System.out.println("Appended: " + sb);
//	        sb.reverse();
//	        System.out.println("Reversed: " + sb);
	
	
	
//	TOOGLCASE
	
//	    public static void main(String[] args) {
//	        String str = "Java";
//	        String result = "";
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i);
//	            if (Character.isUpperCase(ch)) {
//	                result += Character.toLowerCase(ch);
//	            } else if (Character.isLowerCase(ch)) {
//	                result += Character.toUpperCase(ch);
//	            } else {
//	                result += ch;
//	            }
//	        }
//	        System.out.println("Original: " + str);
//	        System.out.println("Toggled: " + result);
	
	
	
	
	        
//	    public static void main(String[] args) {
//	        String str = "Hello@123";
//	        int letters = 0, digits = 0, special = 0;
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i);
//	            if (Character.isLetter(ch)) {
//	                letters++;
//	            } else if (Character.isDigit(ch)) {
//	                digits++;
//	            } else {
//	                special++;
//	            }
//	        }
//	        System.out.println("Letters: " + letters);
//	        System.out.println("Digits: " + digits);
//	        System.out.println("Special Characters: " + special);
	
	
	
	
//	    public static void main(String[] args) {
//	        String sentence = "Java is fun to learn";
//	        String[] words = sentence.split(" ");
//	        String longest = "";
//	        for (String word : words) {
//	            if (word.length() > longest.length()) {
//	                longest = word;
//	            }
//	        }
//	        System.out.println("Longest word: " + longest);
	
	
	
	
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your password: ");
	        String password = sc.nextLine();
	        boolean hasUpper = false;
	        boolean hasLower = false;
	        boolean hasDigit = false;
	        boolean hasSpecial = false;
	        boolean hasMinLength = password.length() >= 8;
	        for (int i = 0; i < password.length(); i++) {
	            char ch = password.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                hasUpper = true;
	            } 
	            else if (Character.isLowerCase(ch)) {
	                hasLower = true;
	            } 
	            else if (Character.isDigit(ch)) {
	                hasDigit = true;
	            } 
	            else if ("!@#$%^&*".contains(String.valueOf(ch))) {
	                hasSpecial = true;
	            }
	        }
	        int strengthPoints = 0;
	        if (hasUpper) strengthPoints++;
	        if (hasLower) strengthPoints++;
	        if (hasDigit) strengthPoints++;
	        if (hasSpecial) strengthPoints++;
	        if (hasMinLength) strengthPoints++;
	        if (strengthPoints == 5) {
	            System.out.println("Password Strength: STRONG");
	        } 
	        else if (strengthPoints >= 3) {
	            System.out.println("Password Strength: MEDIUM");
	        } 
	        else {
	            System.out.println("Password Strength: WEAK");
	        }
	        sc.close();


	    }
}
