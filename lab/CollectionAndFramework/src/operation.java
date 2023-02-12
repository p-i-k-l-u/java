public class operation
{
   int square (int n)
   {
       return n*n;
   }
}

class circle
{
    operation op; // agreegation
    double pi = 3.14;

    double area(int radius)
    {
        op = new operation();
        int rsqaure = op.square(radius);
        return pi*rsqaure;
    }

    public static void main(String[] args) {
        circle c= new circle();

        double result = c.area(5);
        System.out.println(result);
    }
}