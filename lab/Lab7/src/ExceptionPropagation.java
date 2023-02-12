public class ExceptionPropagation {

    void exception()
    {
        int data = 50/0;// unchecked exception occurred
        // exception propagate to exception 1

    }
    void exception1()
    {
        exception();// exception propagate to exception 2
    }

    void exception2()
    {
        try
        {
            exception1();// exception handle
        }
        catch (Exception e)
        {
            System.out.println("Exception Handled ");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.exception2();
        System.out.println("Execution Normal Flow.......");
    }
}
