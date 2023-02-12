//public class OddEven
//{
//    public synchronized void printEven()
//    {
//        int n = 5;
//        for(int i=0;i<=n;i++)
//        {
//            if(i%2==0)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//    public synchronized void printOdd()
//    {
//        int n =5;
//        for(int i=0;i<=n;i++)
//        {
//            if(i%2!=0)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//class Demo1 extends Thread
//{
//    OddEven ref;
//    Demo1(OddEven ref)
//    {
//        this.ref = ref;
//    }
//    public void run()
//    {
//        String n = Thread.currentThread().getName();
//        if()
//            ref.printEven();
//        else
//            ref.printOdd();
//    }
//}
//
//class Demo2 implements Runnable
//{
//    @Override public void run()
//    {
//
//    }
//}
//
//class ch1
//{
//    public static void main(String[] args) {
//        Demo1 obj = new Demo1();
//
//        Demo1 ob1 = new Demo1();
//        Demo1 ob2 = new Demo1();
//
//        D = new Travel();
//
//
//        ob1.start();
//        ob2.start();
//    }
//}
