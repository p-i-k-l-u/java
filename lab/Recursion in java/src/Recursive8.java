import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class Recursive8
{
    public static void subsequence (String str , int index , String newString)
    {
        if(index == str.length())
        {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        // it comes to
        subsequence(str, index+1, newString + currChar);

        // it not comes to

        subsequence(str, index+1 , newString);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        subsequence(str, 0,"");
    }
}
