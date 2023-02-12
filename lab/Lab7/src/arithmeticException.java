import java.util.Scanner;

public class arithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a,b value");
        int  a = sc.nextInt();
        int b = sc.nextInt();

        try
        {
            int c = a/b;

        }
        catch(ArithmeticException A)
        {
            System.out.println("Exception caught");
        }
    }



}
