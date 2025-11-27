package learnJava2025;

public class Wallet {
	    private double balance;
	    public Wallet(double initial) {
	        if (initial < 0) {
	            System.out.println("Initial balance can't be negative. Setting to 0.");
	            this.balance = 0;
	        } else {
	            this.balance = initial;
	        }
	    }
	    public void addMoney(double amount) {
	        if (amount <= 0) {
	            System.out.println("Add amount must be positive.");
	            return;
	        }
	        balance += amount;
	        System.out.println("Added: " + amount + ". New balance: " + balance);
	    }
	    public boolean spend(double amount) {
	        if (amount <= 0) {
	            System.out.println("Spend amount must be positive.");
	            return false;
	        }
	        if (amount > balance) {
	            System.out.println("Insufficient funds. Current balance: " + balance);
	            return false;
	        }
	        balance -= amount;
	        System.out.println("Spent: " + amount + ". New balance: " + balance);
	        return true;
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public static void main(String[] args) {
	        Wallet w = new Wallet(50.0);
	        w.addMoney(25.0);  
	        w.spend(30.0);      
	        System.out.println("Final balance (via getter): " + w.getBalance());
	}
}