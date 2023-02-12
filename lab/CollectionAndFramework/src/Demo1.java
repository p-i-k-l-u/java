public class Demo1
{
    int a =10;
    void inner()
    {
        class Inner
        {
            int b =20;
            void methodInner()
            {
                System.out.println("method Inner: "+ (a+b));
            }
        }
        Inner obj = new Inner();
        obj.methodInner();
    }
}
 class Main1
{
    public static void main(String args[])
    {
        Demo1 out = new Demo1();
        out.inner();
    }
}
