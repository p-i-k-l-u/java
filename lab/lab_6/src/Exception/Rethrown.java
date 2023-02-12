package Exception;

public class Rethrown {

public static void m1()// method
{
    String s = "JAVA";
    try
    {
        char c = s.charAt(4);// risky code
    }
    catch(StringIndexOutOfBoundsException se)// exception
    {
        System.out.println("Please Check the index");
        throw se;// rethrow
    }
}

}

class Main
{
    public static void main(String[] args) {
        Rethrown r = new Rethrown();
        try
        {
            r.m1();// Raise exception to solve this
        }
        catch(StringIndexOutOfBoundsException s)
        {
            System.out.println("Rethrown exception  caught "+s);
        }
    }
}