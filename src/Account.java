public class Account extends Branch
{
    private int AccountID;
    private String AccountTyp;
    private double Balance;

    public Account(int branchID, String branchName, String branchAddress, String pName, String pAddress, int AccountID, String AccountTyp, double Balance)
    {
        super(branchID, branchName, branchAddress, pName, pAddress);
        this.AccountID = AccountID;
        this.AccountTyp = AccountTyp;
        this.Balance = Balance;
    }
    public Account()
    {
        this.AccountID = 0;
        this.AccountTyp = "None";
        this.Balance = 0;
    }
}
