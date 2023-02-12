public class Recursion {
// Ques: print 1 - 5
//    public static void printNumber(int n)
//    {
//        //base case
//        if(n==6)
//        {
//            return;
//        }
//        System.out.println(n);//print
//        printNumber(n+1);
//
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        printNumber(n);
//    }

    // ques: 5 -1

//    public static void printNumber(int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//        System.out.println(n);
//        printNumber(n-1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        printNumber(n);
//    }
    //---------------------------------------

    //Ques: print sum of natural numbers

//    public static void printSum(int i,int n, int sum)
//    {
//        if(i==n)
//        {
//            sum = sum +i;
//            System.out.println(sum);
//            return;
//        }
//        sum = sum +i;
//        printSum(i+1, n,sum);
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        printSum(1,5,0);
//    }
    //------------------------------------------------

    //Ques: calculate factorial
//    public static int calcFactorial(int n)
//    {
//        if(n==1 || n==0 )
//        {
//            return 1;
//        }
//        int fact_nm1 = calcFactorial(n-1);// works on inner function which is gives you n-1 value
//        int fact_n = n*fact_nm1;
//        return fact_n;
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int output = calcFactorial(n);
//        System.out.println(output);
//    }
    //---------------------------------------------
    //Ques: Fibonacci series
//    public static void printFibo(int a, int b, int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//        int c = a+b;
//        System.out.println(c);
//        printFibo(b,c,n-1);
//    }
//
//    public static void main(String[] args) {
//        int a=0,b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n= 8;
//        printFibo(a,b,n-2);
//    }
    //-----------------------------------------

    //Ques: print x^n where stack height = logn
//    public static int calPower(int x, int n)
//    {
//        if(n==0)
//        {
//            return 1;
//        }
//        if(x==0)
//        {
//            return 0;
//        }
//        //n = even
//        if(n%2 ==0)
//        {
//            return calPower(x,n/2) *calPower(x,n/2);
//        }
//        else//n=odd
//        {
//            return calPower(x,n/2) *calPower(x,n/2) *x;
//        }
//    }
//
//    public static void main(String[] args) {
//        int x =2 , n=5;
//        int output = calPower(x,n);
//        System.out.println(output);
//    }

    //-------------------------------------------------
    //Ques: print x^n where stack height = n
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpownm1 = calPower(x,n-1);
        int xpow = x* xpownm1;
        return xpow;
    }

    public static void main(String[] args) {
        int x = 2, n=5;
        int output = calPower(x,n);
        System.out.println(output);
    }


}
