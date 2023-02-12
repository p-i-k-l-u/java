import java.util.Scanner;

public class arrayIndexoutofBound {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many elements you want to store :");

        int num = sc.nextInt();

        int [] a = new int[10];




        try
        {
            for(int i=0;i<=num;i++)
            {
                a[i] = sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException n)
        {
            System.out.println("Exception caught");
        }






    }
}
