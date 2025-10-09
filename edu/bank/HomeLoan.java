package edu.bank;

// HomeLoan implements Loan
public class HomeLoan implements Loan {
    @Override
    public double getInterestRate() {
        return 7.5; // example rate
    }
}
