import java.util.Scanner;

public class convert3 {

    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter the any character :");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);// charAt -> String class methode, sc-> Scanner class reference, scanner class methode -> next() methode

        if(ch>='A' && ch<='Z')
        {
            //Character -> by default java.lang package
            ch2 =  Character.toLowerCase(ch);// Lowercase is a methode, which inside the Character class
            System.out.println("LowerCase "+ch2);
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase " +ch2);
        }
    }

}


