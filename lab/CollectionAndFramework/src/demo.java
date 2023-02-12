
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class demo
{
    void div()
    {
            Scanner sc = new Scanner(System.in);
            try
            {
                System.out.println("Enter the string ");
                String s  = sc.nextLine();
                Integer num = new Integer(s);

            }
            catch (NumberFormatException obj )
            {
                System.out.println(obj);
            }
            try
            {
                System.out.println("Enter the number ");
                int num = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println(e);
            }

            try
            {
                String s = "Apple";
                System.out.println("Enter the index ");
                int pos = sc.nextInt();
                System.out.println(s.charAt(pos));
            }
            catch(StringIndexOutOfBoundsException ob)
            {
                System.out.println(ob);
            }
            try
            {
                System.out.println("Enter the class name ");
                String s = sc.nextLine();
                System.out.println(Class.forName(s));
            }
            catch (ClassNotFoundException ob)
            {
                System.out.println(ob);
            }
            try
            {
                String s = null;
                System.out.println(s.length());
            }
            catch (NullPointerException u)
            {
                System.out.println(u);
            }
            try
            {
                int[] arr = new int[5];
                System.out.println("Enter the index");
                int pos = sc.nextInt();
                arr[pos] = 10;
            }
            catch (ArrayIndexOutOfBoundsException ob)
            {
                System.out.println(ob);
            }
            try
            {
                System.out.println("Enter the denominator ");
                int c = sc.nextInt();
                int b = 40/c;
            }
            catch (ArithmeticException ob)
            {
                ob.printStackTrace();
            }
    }
}

class checkop
{
    public static void main(String[] args) {
        new demo().div();
    }
}