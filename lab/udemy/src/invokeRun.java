class invokeRun extends Thread
{
    public void run()
    {
        for (int i = 1; i < 5; i++)
        {
            System.out.println("Child Threads" );
        }

    }
}

class B
{
    public static void main(String[] args) {
        invokeRun obj = new invokeRun();

        //obj.run();// it can act a normal method not a threads // output is same
        obj.start();// it will act a thread here two threads are created one obj and one main threads
        for(int i=1;i<5;i++)
        {
            System.out.println("Main Threads");
        }
    }
}
