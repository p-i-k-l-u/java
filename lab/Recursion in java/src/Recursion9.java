// Q: print unique subsequence of a string ex: "aaa"

import java.util.HashSet;


public class Recursion9
{
    public static void subsequence (String str , int index , String newString, HashSet<String> set)
    {
        if(index == str.length())
        {
            if(set.contains(newString) )
            {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(index);

        subsequence(str, index +1, newString+ currChar, set);
        subsequence(str, index + 1, newString , set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str,0,"",set);
    }
}
