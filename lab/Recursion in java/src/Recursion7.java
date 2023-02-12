import java.util.Scanner;

public class Recursion7
{
    public static boolean[] map = new boolean[26];
    //recursive function
    public static void removeDuplicate(String str , int index , String newString)
    {
        if(index == str.length())
        {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar -'a']== true )
        {
            removeDuplicate(str,index + 1,newString);
        }
        else
        {
            // new value plus in the currChar
            newString = newString + currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str , index + 1, newString);

        }
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String str = sc.nextLine();
        removeDuplicate(str, 0,"");
    }
}
