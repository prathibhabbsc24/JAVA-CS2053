class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance ₹5000

        try {
            System.out.println("Attempting to withdraw 6000...");
            account.withdraw(6000); // Trying to withdraw more than balance
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

        try {
            System.out.println("\nAttempting to withdraw 3000...");
            account.withdraw(3000); // Successful withdrawal
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
