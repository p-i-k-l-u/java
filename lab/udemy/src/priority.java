class priority extends Thread {
    public void run()//method
    {
        System.out.println(Thread.currentThread().getName());//print currently executing threads
        System.out.println(Thread.currentThread().getPriority());
    }
}

class C
{
    public static void main(String[] args) {
        priority t1 = new priority();
        priority t2 = new priority();

        t1.setName("Piklu");
        t2.setName("thread");

//        t1.setPriority(8);
//        t2.setPriority(9);

        t1.start();
        t2.start();
    }
}