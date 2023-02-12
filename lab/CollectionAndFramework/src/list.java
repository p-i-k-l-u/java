import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which you want to store ");

        int N = sc.nextInt();

        List<Integer> L = new ArrayList<>(N);

        for(int i=0;i<N;i++)
        {
            L.add(sc.nextInt());
        }

        int Q = sc.nextInt();

        for(int i=0;i<Q;i++)
        {
            String operation = sc.next();

            if(operation.equals("Insert"))
            {
                int index = sc.nextInt();
                int value = sc.nextInt();

                L.add(sc.nextInt());
            } else if (operation.equals("Delete"))
            {
                 int value = sc.nextInt();
                 L.remove(sc.nextInt());
            }
        }

        for(int element: L)
        {
            System.out.println(element);
        }
    }
}
