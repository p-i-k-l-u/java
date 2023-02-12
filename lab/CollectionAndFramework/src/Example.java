public class Example implements Cloneable
{
    int sapid;
    String name;
    Example(int x, String y)
    {
        this.sapid = x;
        this.name = y;
    }
    void output()
    {
        System.out.printf("%d-%s\n", sapid, name);
    }
    public static void main(String args[]) throws CloneNotSupportedException	//throw the checked exception up the stack to the calling method to handle
    {
        try
        {
            Example obj = new Example(500012345, "Candace");
            obj.output();
            Example copy = (Example)obj.clone();
            copy.output();

            copy.name = "Matilda";			//change made with 'copy' is NOT reflected to original object
            obj.output();
            copy.output();
            System.out.println(obj+" - "+copy);
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}

