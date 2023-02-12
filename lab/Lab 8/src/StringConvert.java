import java.util.Scanner;

public class StringConvert {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any String :");
        String str = sc.nextLine();
        System.out.println("Convert the String : "+toUpperCase(str));





    }

    public static String toUpperCase(String str) // instance of StringBuffer class which is convert string to uppercase method
    {
        StringBuffer obj = new StringBuffer(str);
        for(int i=0;i<obj.length();i++)
        {
            char c = obj.charAt(i);// iterate the each character with the help of charAt() methode
            obj.setCharAt(i,Character.toUpperCase(c));// Character class wraps the value of primitive type char in a object

        }
        return obj.toString();

    }

}
