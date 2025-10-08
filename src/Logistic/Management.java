package Logistic;

public class Management
{
    public static void main(String[] args) {
        Bank c1 = new Customer();
        Bank b1 = new Branch(1,"Chase", "Nenimo","JPMorgan", "NYC rd 33");

        b1.setName("JP");
        System.out.println(b1.getName());
        System.out.println(c1.getAdress());
    }
}