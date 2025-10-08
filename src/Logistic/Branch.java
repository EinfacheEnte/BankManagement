package Logistic;

public class Branch extends Bank {

    private int branchID;
    private String branchName;
    private String branchAddress;

    public Branch(int branchID, String branchName, String branchAddress, String pName, String pAddress) {
        super(pName, pAddress);
        this.branchID = branchID;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
    }
    public Branch() {
        this.branchID = 0;
        this.branchName = "None";
        this.branchAddress = "None";
    }

}
