public class blockSynchronization {

    // synchronized method then disadvantages is waiting time is more
    // public synchronized void show(String name)
    public void show(String name)//receive the name
    {
        ;;;;;;;;;;; //100 line of code

        synchronized (this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are u"+name );
            }
        }
        ;;;;;;;;;;;;
    }
}

class thread1 extends Thread
{
    // create reference
    blockSynchronization ref;
    // String name value pass
    String name;

    //create constructor in the thread1 class
    thread1(blockSynchronization ref,String name)//pass the reference
    {
        this.ref = ref;//current obje
        this.name = name;
    }
    // override the method use the run()

    public void run()
    {
        ref.show(name);
    }

}

class thread2 extends Thread
{

    blockSynchronization ref;
    String name;

    thread2(blockSynchronization ref , String name)
    {
        this.ref = ref;
        this.name = name;
    }
    public void run()
    {
        ref.show(name);
    }
}

class check
{
    public static void main(String[] args) {
        blockSynchronization ref = new blockSynchronization();

        thread1 t1 = new thread1(ref,"Piklu");
        thread2 t2 = new thread2(ref,"Ram");

        t1.start(); t2.start();
    }
}