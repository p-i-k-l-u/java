//import java.util.Scanner;

public class StringObject {

    String name;

    StringObject(String n) {
        name = n;
    }

    void display()  // function
    {
        System.out.println("Name is -> :" + name);
        // occurence
        int occur = 0;
        int len = name.length();
        // iterate the loop at the end position

        for (int i = 0; i < len; i++)
            if (name.charAt(i) == 'A' || name.charAt(i) == 'a')
            // condition when program find capital A and small a then the return time of occur in the String
            {
                occur++; // and increment  occur

                System.out.println("Number of occurrence : " + occur);

                System.out.println("Position of the A or a: " + (i + 1));
            }

        if (occur == 0)
            System.out.println("A is not availble in the string ");
    }

    }

    class Main
    {
        public static void main(String[] args) {
            StringObject obj = new StringObject("Anil kumar ");
            obj.display();
            StringObject obj1 = new StringObject("java");
            obj1.display();

        }
    }










