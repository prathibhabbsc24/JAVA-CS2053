package edu.bank;

// CarLoan implements Loan
public class CarLoan implements Loan {
    @Override
    public double getInterestRate() {
        return 9.0; // example rate
    }
}
