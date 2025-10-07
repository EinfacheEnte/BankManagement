public class Customer extends Loan
{
    private int CustomerID;
    private String CustomerName;
    private String CustomerType;
    private String CustomerAddress;
    private int CustomerPhone;

    public Customer(){
        this.CustomerID = 0;
        this.CustomerName = "None";
        this.CustomerType = "None";
        this.CustomerAddress = "None";
        this.CustomerPhone = 0;
    }
    public Customer(int branchID, String branchName, String branchAddress, String pName, String pAddress, int AccountID, String AccountTyp, double Balance, int LoanID, String LoanType, int LoanAmount, int CustomerID, String CustomerName, String CustomerType, String CustomerAddress, int CustomerPhone){
       super(branchID, branchName, branchAddress, pName, pAddress, AccountID, AccountTyp, Balance, LoanID, LoanType, LoanAmount);

       this.CustomerID = CustomerID;
       this.CustomerName = CustomerName;
       this.CustomerType = CustomerType;
       this.CustomerAddress = CustomerAddress;
       this.CustomerPhone = CustomerPhone;
    }

    public int getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

}
