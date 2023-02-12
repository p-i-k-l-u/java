public class Test {
    private static  void printLength(String str)
    {
        System.out.println(str.length());
    }

    public static void main(String args[]) {
        try
        {
            String myString = null;
        }
        catch(NullPointerException a)
        {
            System.out.println("Piklu");
        }
//        printLength(myString);

    }
}
