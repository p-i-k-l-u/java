public class Travel
{
    int available_seats = 150;
    synchronized void book(int seats)
    {
        if(seats > available_seats)
        {
            try{
                wait();
            }
            catch(InterruptedException ex){}
        }
        available_seats = available_seats - seats;
        System.out.println("Seats booked successfully!!");
    }
    synchronized void cancel(int seats)
    {
        available_seats = available_seats + seats;
        System.out.println("Seats canceled successfully!!");
        notify();
    }
}

class MainT2
{
    public static void main(String args[])
    {
        Travel t= new Travel();
        Thread t1=new Thread()
        {
            public void run() {
                t.book(120);  }
        };
        t1.start();
        Thread t2=new Thread()
        {
            public void run() {
                t.cancel(12);  }
        };
        t2.start();
    }
}

