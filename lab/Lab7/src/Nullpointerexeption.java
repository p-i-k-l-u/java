import java.util.Scanner;

public class Nullpointerexeption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Name ");
        String s1 = sc.nextLine();
        s1 = null;
        try
        {
            System.out.println(s1.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception caught");
        }



    }
}
