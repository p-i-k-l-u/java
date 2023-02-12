import java.util.Scanner;

public class FindFastAndLastString {

   public static void StringFind(String str)//function
   {
       int n = str.length(); // find length


       char  fast = str.charAt(0);// fast string character

       char last = str.charAt(n-1); // last string character

       System.out.println("First String character is : "+fast);
       System.out.println("Last String character is :" +last);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the any String :");  // user to input

        String str = sc.nextLine();



        //function call
        StringFind(str);


    }
}
