
package P3;
import P1.*;
import P2.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arithmetic A = new Arithmetic();
        Rational r = new Rational();
        Bitwise B = new Bitwise();
        Logical l = new Logical();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(true)
        {
            System.out.println("\nPress1 for Arithmetic operation \nPress2 for Rational operation" +
                    "\nPress3 for Logical  Operation\nPress4 for Bitwise operation\n");
            System.out.println("Enter the Choice:");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Sum = " + A.add(a,b));
                    System.out.println("Difference = "+A.sub(a,b));
                    System.out.println("Multiplication = "+A.mul(a,b));
                    System.out.println("Division = "+A.div(a,b));
                    break;

                case 2:
                    System.out.println("A == B it is true or False = "+r.equalTo(a,b));
                    System.out.println("A>B it is true or false = "+r.greaterThan(a,b));
                    System.out.println("A<B it is true or false = "+r.lessThan(a,b));
                    break;

                case 3:
                    System.out.println("a>b && b<a it is true or false = "+l.Land(a,b));
                    System.out.println("a>b || b<a it is true or false = "+l.Lor(a,b));
                    System.out.println("a>b!=b>a it is true or false = "+l.LNot(a,b));
                    break;

                case 4:
                    System.out.println("Using left shift value is = "+B.leftShift(a,b));
                    System.out.println("Using right shift value is "+B.rightShift(a,b));
                    System.out.println("Using compliment value is = "+B.compliment(a));
                    System.out.println("Using or a>b|B<a it is true or false = "+B.Bor(a,b));
                    System.out.println("Using and a>b&b<a it is true or false = "+B.Band(a,b));
                    break;

                default:
                    System.out.println("Invalid Input");

            }



        }
    }
}
