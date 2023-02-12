import java.util.Scanner;

public class Convert {

    public  void InttoInteger(){
//        public static void main(String[] args) {
            int a = 100;
            // Int to Integer convert using Integer.valueOf() methode
            Integer obj = Integer.valueOf(a);
            System.out.println("Value is "+obj);
        }


    public void IntegertoString()
    {
        int a = 2000;
        int b = -1223;
        int c = 300000;
        // convert Integer to String with the help of Integer.toString() Methode
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        System.out.println("Value of A is -> "+str1);
        System.out.println("Value of B is -> "+str2);
        // another methode is String.valueof()

        String str3 = String.valueOf(c);
        System.out.println("Value of C is -> "+str3);

    }
    public void StringtoInteger()
    {
        String str = "23";
        int number = Integer.parseInt(str);
        System.out.println("The value is convert from String to Integer -> " + number);
    }

    public void InttoString()
    {
        int i = 300;
        String s = String.valueOf(i);
        System.out.println("Value is -> "+ (i+100));// output is 300 because '+' is the binary addition operator
        System.out.println("Value is -> "+ (s+100));// output is 300100 beacuse '+'is a string concatination


    }

    public void StringtoInt()
    {
        String  str = "500";
        int  number = Integer.parseInt(str);
        System.out.println("Value is -> "+ number );
    }
    public void IntegertoInt()
    {
        Integer object = 68;

        // Returns the value of this Integer as an int
        int i = object.intValue();

        // Printing the value above stored in integer
        System.out.println("The integer Value of i = " + i);
    }
}
class check
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Convert obj = new Convert();
            while(true)
            {
                System.out.println("\n Press 1 for Int to Integer\nPress 2 fot Integer to String " +
                        "\n Press 3 String to Integer\nPress 4 for int to String \n press 5 fot String to Int " +
                        "\nPress 6 for Integer to Int");
                System.out.println("Enter the choice:");

                int choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                        obj.InttoInteger();
                        break;
                    case 2:
                        obj.IntegertoString();
                        break;
                    case 3:
                        obj.StringtoInteger();
                        break;
                    case 4:
                        obj.InttoString();
                        break;
                    case 5:
                        obj.StringtoInt();
                        break;
                    case 6:
                        obj.IntegertoInt();
                        break;
                    default:
                        System.out.println("Invalid Choice ");





                }

            }
        }
    }


