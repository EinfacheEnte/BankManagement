package Logistic;

public class Loan extends Account
{
    private int LoanID;
    private String LoanType;
    private double LoanAmount;

    public Loan() {
        this.LoanID = 0;
        this.LoanType = "None";
        this.LoanAmount = 0;
    }
    public Loan(int branchID, String branchName, String branchAddress, String pName, String pAddress, int AccountID, String AccountTyp, double Balance, int LoanID, String LoanType, int LoanAmount) {
        super(branchID, branchName, branchAddress, pName, pAddress, AccountID, AccountTyp, Balance);
        this.LoanID = LoanID;
        this.LoanType = LoanType;
        this.LoanAmount = LoanAmount;
    }
}
