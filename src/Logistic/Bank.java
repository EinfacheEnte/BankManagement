package Logistic;

public class Bank {

    private String Name;
    private String Adress;

    Bank(){
        this.Name = "None";
        this.Adress = "None";
    }

    Bank(String pName, String pAddress) {
        this.Name = pName;
        this.Adress = pAddress;
    }
    public String getName() {
        return Name;
    }
    public void setName(String pName) {
        this.Name = pName;
    }
    public String getAdress() {
        return Adress;
    }
    public void setAdress(String pAdress) {
        this.Adress = pAdress;
    }

}
