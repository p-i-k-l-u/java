package P2;

public class Logical {

    public boolean Land(int a, int  b)
    {
        return (a>b && b<a);
    }
    public boolean Lor(int a, int  b)
    {
        return a>b || b<a;
    }
    public boolean LNot(int  a, int b)
    {
        return (a>b!= b>a);
    }
}
