public class ATM
{
    int amt = 1200;
    synchronized void withdrew(int amount)
    {
        if(amount < amt)
        {
            System.out.println("Less balance!, waiting for deposit");
            try {
                wait();
            }
            catch (InterruptedException e){};
        }

        amt = amt - amount;
        System.out.println("Withdrawl completed successfully!");
    }
    synchronized void deposit(int amount )
    {
        System.out.println("going to deposit");

        amt = amt + amount ;
        System.out.println("Amount Deposited Successfully!");
        notify();
    }
}
class Mai
{
    public static void main(String[] args) {
        ATM obj = new ATM();

        Thread t1 = new Thread()
        {
            public void run()
            {
                obj.deposit(20);
            }
        };
        t1.start();
        Thread t2 = new Thread()
        {
            public void run()

            {
                obj.withdrew(1485);

            }
        };
        t2.start();
    }
}