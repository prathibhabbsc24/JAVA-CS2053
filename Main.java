import edu.bank.*;

public class Main {
    public static void main(String[] args) {
        Loan home = new HomeLoan();
        Loan car = new CarLoan();

        System.out.println("Home Loan Interest Rate: " + home.getInterestRate());
        System.out.println("Car Loan Interest Rate: " + car.getInterestRate());
    }
}
