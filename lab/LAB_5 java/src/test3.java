import java.util.Scanner;

public interface test3
{
    int division (int a, int b);
    int modulus (int a , int b);

}

class P1 implements test3
{
    public int division(int a , int b)
    {
        return a/b;
    }

    public int modulus(int a , int b)
    {
        return a%b;
    }
}
// which is do not implement

class P2
{
    public int division(int a , int b)
    {
        return a/b;
    }
    public int modulus(int a, int b)
    {
        return a%b;
    }
}

class override
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value Of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the Value Of b = ");
        int b = sc.nextInt();
        P1 obj = new P1();
        P2 obj2 = new P2();
        System.out.println("P1 class Divisions is " + obj.division(a,b));
        System.out.println("P2 Class Divisions is " + obj2.division(a, b));
        System.out.println("P1 class Modulus is " + obj.modulus(a,b));
        System.out.println("P2 class Modulus is " + obj2.modulus(a,b));
    }
}
