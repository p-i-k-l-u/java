public class Recursion3
{
    // function
    public static void printReveres(String str , int index)
    {
        if(index == 0)
        {
            System.out.println(str.charAt(index));
            return ;
        }


        System.out.println(str.charAt(index));
        printReveres(str, index -1 );
    }

    public static void main(String[] args) {
        String str = "ABCD";
        printReveres(str , str.length()-1);
    }
}
