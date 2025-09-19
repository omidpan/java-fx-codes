package champlaincollege.demo.chapter15.load;

public class Loan {

    private double interestRate;
    private double loanAmount;
    private int loanYear;

    public Loan(double interestRate, int loanYear, double loanAmount) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.loanYear = loanYear;
    }

    /**
     * <h1>We will use fix rate amortization for montly payment </h1>
     * <li>PMT: is monthly payment</li>
     * <li>Monthly rate(r) is 4.5% /12</li>
     * <li>total number of payment is year*12</li>
     * @return
     */
    public double getMonthlyPayment(){
        final double monthlyInterestRatePercent = this.interestRate/1200;
        final int totalMonths = this.loanYear*12;
        final double monthlyPayment=(monthlyInterestRatePercent*this.loanAmount)/(1-Math.pow((1+monthlyInterestRatePercent),-totalMonths));
        return monthlyPayment;

    }
    private double getYearlyPayment(){
        return getMonthlyPayment()*12;
    }
    public double getTotalPayment(){
        return this.getYearlyPayment()*this.loanYear;
    }
}
