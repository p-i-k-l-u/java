import java.util.Scanner;

public class Recursion2 {
    public static void towerOfHanoi(int n, String src , String help,String des)
    {
        // when only one disk present in the tower
        if(n==1)
        {
            System.out.println("Transfer "+ n+ " From "+ src + " to "+ des);
            return ;
        }

        towerOfHanoi(n-1,src,des,help); // destination as helper and helper as a destination
        System.out.println("Transfer " +n + " From " + src + " to " + des);
        towerOfHanoi(n-1,help,src,des); // here source as a helper and helper as a source

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the disk number :");
        int n = sc.nextInt();
        towerOfHanoi(n,"S","H","D");

    }
}
