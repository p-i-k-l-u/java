// helper class
public class A2 {
    // helper method
    private void m1()
    {
        System.out.println("PIKLU");
    }

}
// driver class
class B1
{
    // main method
    public static void main(String[] args) {
        // creating object of type class A

        A2  obj = new A2();
        // accessing the method m1()
        //obj.m1();// error m1() has private access in A ;
    }
}
