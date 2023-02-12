import java.util.Scanner;
import java.util.Arrays;

public class hackerrank {
    static boolean isanagram(String a, String b)
    {
        // create a character array and with lower and upper case
        char[] aArray = a.toLowerCase().toCharArray();// toCharArray used in java converts the given string to the sequence of the character and return the array length equal of the string array
        char[] bArray = b.toLowerCase().toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray,bArray);

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the any String two times  : ");
       String  a = sc.nextLine();
       String  b = sc.nextLine();

       boolean pass = isanagram(a,b);
        System.out.println((pass)?"Anagram": "NotAnagram");
    }
}
