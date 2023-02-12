public class ArithmeticException {
    public static void main(String[] args) {
        int a=10 , b=0, c;
            try
            {
                c=a/b;
            }
            catch(java.lang.ArithmeticException e)
            {
                System.out.println("exception caught");
            }


    }
}
