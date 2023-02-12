class Table
{
    synchronized static void number(int a)		//synchronized(Table.class)
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": " + (i*a));
        }
    }
}

class Main14
{
    public static void main(String args[])
    {
        Thread t1 = new Thread()
        {
            public void run()
            {
                Table.number(2);
            }
        };

        Thread t2 = new Thread()
        {
            public void run()
            {
                Table.number(7);
            }
        };
        t1.start();
        t2.start();
    }
}

