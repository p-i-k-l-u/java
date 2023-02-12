import java.util.Scanner;

public class Convert2 {
    public  void floattoFloat(){
//        public static void main(String[] args) {
        float a = 100.5f;

        Float obj = Float.valueOf(a);
        System.out.println("Value is "+obj);
    }


    public void floattoString()
    {
        float f = 40.6F;

        String s = Float.toString(f);
        System.out.println("String value is -> "+s);

    }
    public void Stringtofloat()
    {
        String str = "23";
        float f = Float.parseFloat(str);
        System.out.println("String to Float value is ->"+f);
    }

    public void FloattoString()
    {
        float ob = 43F;
        String s = String.valueOf(ob);
        System.out.println("Float to String value is ->"+s);


    }

    public void StringtoFloat()
    {
        String  str = "500";
        Float f = Float.valueOf(str);
        System.out.println("String to Float value is ->"+f);
    }
    public void Floattofloat()
    {
        Float object = 68F;

        // Returns the value of this Integer as an int
        float i = object.intValue();

        // Printing the value above stored in integer
        System.out.println("The integer Value of i = " + i);
    }
}
class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convert2 obj = new Convert2();
        while(true)
        {
            System.out.println("\n Press 1 for float to Float\nPress 2 fot float to String" +
                    "\n Press 3 String to float \nPress 4 for Float to String  \n press 5 fot String to Float " +
                    "\nPress 6 for  Float to float");
            System.out.println("Enter the choice:");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj. floattoFloat();
                    break;
                case 2:
                    obj.floattoString();
                    break;
                case 3:
                    obj.Stringtofloat();
                    break;
                case 4:
                    obj.FloattoString();
                    break;
                case 5:
                    obj.StringtoFloat();
                    break;
                case 6:
                    obj. Floattofloat();
                    break;
                default:
                    System.out.println("Invalid Choice ");





            }

        }
    }
}
