package TotalBalance;

public class Account1 {
    private String ID;// method
    private float balance;
    public Account1(String ID , float balance)// constructor
    {
        this.ID = ID;
        this.balance = balance;

    }

    public void Display_balance()// function
    {
        System.out.println("Balance = "+balance+ "\nID = " + ID);
    }
}
