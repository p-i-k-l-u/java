package P2;

public class Bitwise {
    // shift
    public int leftShift(int a, int b)
    {
        return (a<<b);
    }

    public int rightShift(int a, int b)
    {
        return (a>>b);
    }
    // compliment
    public int compliment (int a)
    {
        return ~a;
    }

    public boolean Bor(int a, int b)
    {
        return a>b|b<a;
    }

    public boolean Band(int a, int b)
    {
        return a>b&b<a;
    }



}
