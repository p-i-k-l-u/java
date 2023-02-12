class Table
{
    synchronized void peven(int n)
    {
        System.out.println("Even Numbers");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
    synchronized void podd(int m)
    {
        System.out.println("Odd Numbers");
        for(int i=1;i<=m;i++)
        {
            if(i%2==1)
                System.out.println(i);
        }
    }
    synchronized void fibo(int y)
    {
        int n1=0,n2=1,n3;
        System.out.println("Fibonacci series");
        System.out.print(n1 + " " + n2);
        for(int i=2;i<y;i++)
        {
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
    }
}

class Demo extends Thread
{
    Table t;
    Demo(Table obj)
    {  t=obj; }
    public void run()
    {
        if(Thread.currentThread().getName()=="T1")
            t.peven(20);
        else
            t.podd(20);
    }
}

class Demo1 implements Runnable
{
    Table t;
    Demo1(Table obj)
    { t = obj; }
    public void run()
    {
        t.fibo(20);
    }
}

class MainT1
{
    public static void main(String args[])
    {
        Table t = new Table();
        Demo t1= new Demo(t);
        Demo t2 = new Demo(t);
        t1.setName("T1");
        Demo1 d = new Demo1(t);
        Thread t3 = new Thread(d);
        t1.start();
        t2.start();
        t3.start();
    }
}

