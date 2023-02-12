
class Outer
{

    //public void Display()
    public static void Display()
    {
        System.out.println("Outer class ");
    }

    static class inner
    {

        //public void disp()
        public static void disp()
        {
            System.out.println("Inner class ");
        }

    }
}

public class inner
{
    public static void main(String[] args) {
        // create outer class obj

        Outer obj = new Outer();

        obj.Display();

        // access inner class

        //Outer.inner obj1 = obj.new inner(); // with the help of outer class obj
        // static class access by Outer class

        Outer.inner obj1 = new  Outer.inner();

        obj1.disp();



    }
}
