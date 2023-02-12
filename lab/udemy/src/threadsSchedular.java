class threadsSchedular extends Thread
{
    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }
}

class M
{
    public static void main(String[] args) {
        threadsSchedular obj1 = new threadsSchedular();
        threadsSchedular obj2 = new threadsSchedular();
        threadsSchedular obj3 = new threadsSchedular();

        obj1.setName("threads1");
        obj2.setName("threads2");
        obj3.setName("threads3");

        obj1.start();
        obj2.start();
        obj3.start();

        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
        }

    }
}
