

public class A1 {
    protected void m1()
    {
        System.out.println("PIKLU");
    }

}

class B extends  A1{
    public static void main(String[] args) {
        // creating parent object of a parent class
        // using parent reference
        A1 a = new A1();
        // calling method m1()
        a.m1();
   // creating a child object of child class
   // using child reference
        B b = new B();
        // calling method m1()
        b.m1();

        // creating object of child class
        // using parent reference
        A1 obj = new B();
        // calling method
        obj.m1();



    }
}