package Balance;

public class Account {
    private String ID;
    private float balance;
    public Account (String ID, float balance)//constructor
    {
        this.ID = ID;
        this.balance = balance;
    }
    public void Display_Balance()
    {
        System.out.println("ID : "+ ID + "\nBalance :  " +balance );

    }
}
