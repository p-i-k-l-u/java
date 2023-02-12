 class A implements  Runnable {

    public  void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Piklu");
        }
    }
}

class main
{
    public static void main(String[] args) {
        A obj = new A();
        Thread  obj1 = new Thread(obj);
        obj1.start();

        for(int i=0;i<=5;i++)
        {
            System.out.println("Ram");
        }
    }
}