package opps;

public class ATM {
    private String accountHolderName;
    private double balance;

    ATM(String name , double bal)
    {
        this.accountHolderName=name;
        this.balance=bal;
    }

    public static void main(String[] args) {
        ATM atm=new ATM("rishu", 1000);
        atm.showBal();
    }

    void showBal()
    {
        System.out.println("You current bal = "+ balance);
    }
}
