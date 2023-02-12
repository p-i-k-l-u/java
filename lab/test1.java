import java.util.Scanner;

interface test1
{
   int square(int n);// declare the interfaces 

}

class arithmetic implements test1 // implements the interfaces 
{
   public int  square(int n)
   {
         return n*n;
   }
}

class ToTestInt
{
   public static void main (String[] args)
   {
      System.out.println("Enter the number ");
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      
      arithmetic obj = new arithmetic();
      
      System.out.println("Square of the number is :  "+ obj.square(n));
}

}