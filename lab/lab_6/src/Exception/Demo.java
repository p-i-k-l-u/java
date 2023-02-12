package Exception;
class InvalidAgeException extends Exception
{
     //parameterized constructor
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class Demo {
    public static void main(String[] args) {
        int age;
        try
        {
            vote(42);
            vote(12);
        }
        catch (Exception e)//superclass Exception
        {
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalidAgeException
    {

        if(age<18)
        {
            throw new InvalidAgeException("Not eligible for voting ");
        }
        else {
            System.out.println("Eligible for voting ");
        }
    }


}
