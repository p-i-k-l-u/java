import java.util.Scanner;

public class divisibility {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number from which you want to start the search");
            int start = sc.nextInt();
            System.out.println("Enter the number till which you want to search the number");
            int end = sc.nextInt();
            System.out.println("Enter the number for checking the divisibility criteria");
            int div = sc.nextInt();
            int sum=0;
            if(start<end || start==end){
                for(int i= start; i<=end; i++)
                {
                    if(i%div==0)
                    {
                        sum+=i;
                    }
                }
            }
            else{
                System.out.println("Enter a valid start and end value");
            }
            System.out.println("sum = " + sum);
        }
    }




