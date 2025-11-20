package learnJava2025;

public class BankAccount {
	private String owner;
	private double balance;
	
	private BankAccount (String owner, double balance) {
		this.setOwner(owner);
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount. Account is blocked");
		}else {
			balance += amount;
			System.out.println("Amount Deposited");
		}
	}
		
		public void withdraw(double amount) {
			if (amount <= 0) {
				System.out.println("Please enter valid amount");
			}else if
				(amount > balance) {
				System.out.println("Insufficient Balance");
			} else {
				balance -= amount;
				System.out.println("Withdraw sucess :" + amount);
			}
		}
		public double getBalance() {
			return balance;
		}
		public static void main(String[] args) {
			BankAccount account = new BankAccount("Masina Datta Sai ", 3500);
			account.deposit (500);
			account.deposit(-500);
			account.withdraw(-200);
			account.withdraw(4500);
			account.withdraw(1200);
			System.out.println("Final Balance = " + account.getBalance());
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

}
