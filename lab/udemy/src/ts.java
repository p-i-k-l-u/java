


public class ts
{
  public synchronized void printTable(int a )
  {
      for(int i=1;i<=10;i++)
      {
          System.out.println("Table is : " + a*i);
      }
  }
}

class threads extends Thread
{
    // create a threads class reference
    ts ref;

    // now create  a constructor

    threads(ts ref)
    {
        //store the value in the ref varaiable
        this.ref = ref;
    }
    // override the method  on threds class

    public void run()
    {
        ref.printTable(5);
    }

}

class thread extends Thread
{
    ts ref;
    thread(ts ref)
    {
        this.ref = ref;
    }
    public void run()
    {
        ref.printTable(7);
    }
}
class e
{
    public static void main(String[] args) {
        ts obj = new ts();
        threads o = new threads(obj);
        thread o1 = new thread(obj);

        o.start();
        o1.start();
    }
}
