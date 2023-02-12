import java.util.Scanner;

public interface A {

    int add(int a , int b);
    int sub (int a, int b);

}

class MyClass implements A
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value Of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the Value Of b = ");
        int b = sc.nextInt();

        MyClass obj = new MyClass();
        System.out.println("ADD "+obj.add(a,b));
        System.out.println("SUB "+obj.sub(a,b));
    }
}


