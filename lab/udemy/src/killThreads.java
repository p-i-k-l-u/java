public class killThreads {
     static volatile boolean flag = true;

    public static void main(String[] args) {
        //killThreads obj = new killThreads();
        Thread obj = new Thread(){
            public void run()
            {
                while(flag)
                {
                    System.out.println("Hello");//infinite loop which is stop by killing thread dead

                }
            }
        };
        obj.start();

        System.out.println("Main : Thread Hello");
        System.out.println("Main: Thread Bye");
        flag = false;


    }
}
