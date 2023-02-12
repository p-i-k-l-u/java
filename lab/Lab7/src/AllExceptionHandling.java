
import java.util.Scanner;


public class AllExceptionHandling {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("how many element you want to store, less than 10");

        int num = sc.nextInt();
        int [] arr = new int[10];

        String pt = null;
        System.out.println("Enter the age under 100");
        int age = sc.nextInt();

        while(true)
        {
            System.out.println("Press 1 for ArithmeticException\nPress 2 for StringIndexOutOfBoundException\n " +
                    "Press 3 ArrayIndexOutOfBoundException\n Press 4 for NullPointerException \n" +
                    "Press 5 for illegalException\n Press 6 NumberFormatException\n Press 7 ClassNotFoundException ");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    try
                    {
                        int c = a/b;
                        System.out.println(c);
                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println("Exception Caught");
                    }
                    break;
                case 2:
                    try
                    {
                        String str = "word";
                        System.out.println(str.charAt(9));
                    }
                    catch(StringIndexOutOfBoundsException n)
                    {
                        System.out.println("String Exception caught");
                    }
                    break;
                case 3:
                    try
                    {
                        for(int i=0;i<=num;i++)
                        {
                            arr[i] = sc.nextInt();
                        }

                    }
                    catch (ArrayIndexOutOfBoundsException p)
                    {
                        System.out.println("Array Exception Caught");
                    }
                    break;

                case 4:
                    try
                    {
                        System.out.println(pt.toString());




                    }
                    catch (NullPointerException N)
                    {
                        System.out.println("NullPointer Exception Caught");
                    }
                    break;
                case 5:


                try
                {
                    if(age>100 || age<0)
                    {
                        throw new IllegalArgumentException("Invalid age");

                    }
                    else {
                        System.out.println("Your age " + age + "years");
                    }
                }
                catch(IllegalArgumentException p)
                {
                    System.out.println("IllegalArgumentException Caught ");
                }

                break;

                case 6:
//
                    while(true)
                    {
                        System.out.println("Enter the any valid Integer :");

                        try
                        {
                            int number = Integer.parseInt(sc.next());

                            System.out.println("You entered "+ number);
                        }
                        catch(NumberFormatException n1)
                        {
                            System.out.println("NumberFormatException caught");
                        }

                        break;

                    }

                case 7:
                    try
                    {
                        Class.forName("ExceptionHandling ");
                    }
                    catch(ClassNotFoundException c1)
                    {
                        System.out.println("ClassNotFoundException Caught");
                    }

                    break;








                default:
                    System.out.println("Invalid Exception");
            }
        }



    }



}
