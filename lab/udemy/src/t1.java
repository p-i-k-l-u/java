class t1 extends Thread
{
    public void run()
    {
        String name = (Thread.currentThread().getName());
        for(int i=0;i<=3;i++)
        {
            System.out.println(name );
        }
    }
}

class t2 extends Thread
{
    public void run()
    {
        String name = (Thread.currentThread().getName());
        for (int i=0;i<=3;i++)
        {
            System.out.println(name);

            // threads class object
            Thread.yield();
        }
    }
}
class d
{
    public static void main(String[] args) {
        t1 obj = new t1();
        t2 oj = new t2();

        obj.setName("piklu");
        oj.setName("Ram");



        obj.start();
        oj.start();
    }
}