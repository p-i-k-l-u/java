class CT extends Thread
{
    public void run()
    {
        int n =10;
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
class CU
{
    public static void main(String[] args) {
        CT obj = new CT();
        obj.start();
    }
}
