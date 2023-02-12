



class Customer implements Runnable{




    int amt = 10000;
    public void run(){
        withdraw(15000);
        //Thread.sleep(1000);
        deposit(2000);
    }

    synchronized void withdraw(int amount){
        if(amt < amount){
            System.out.println("Less balance!, waiting for deposit");
            try{
                wait();
            }
            catch(Exception e){}
        }
        amt -= amount;
        System.out.println("Withdrawl completed successfully!");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        amt += amount;
        System.out.println("Amount Deposited Successfully!");
        notify();
    }

}

class InterThread{
    public static void main(String[] args){
        Customer c = new Customer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();    
  }
}