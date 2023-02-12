
// using generic class

public class GenericsDemo<A,B>
{
    void add(A var1, B var2)
    {
        System.out.println(var1);
        System.out.println(var2);
    }
    public static void main(String args[])
    {
        GenericsDemo<Integer,String> obj = new GenericsDemo<Integer, String>();
        obj.add(46,"Piklu");
    }
}

//----------------------------------------------------------------


