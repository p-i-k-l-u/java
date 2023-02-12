
//Q: find the first and last occurance in given string where element = a;

public class Recursion4
{
    // declare first and last element which are empty
    public static int first = -1;
    public static int last = -1;

    public static void findOccur(String str, int index , char ele)
    {
        if(index == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }


        char currChar = str.charAt(index);
        if(currChar == ele)
        {
            if(first == -1 )
            {
                first = index;
            }
            else
            {
                last = index;
            }
        }
        findOccur(str , index +1 , ele);
    }

    public static void main(String[] args)
    {
        String str = "abaacdaefaah";
        findOccur(str , 0 , 'a');

    }

}
