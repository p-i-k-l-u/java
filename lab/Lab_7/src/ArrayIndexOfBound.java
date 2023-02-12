
import java.util.Scanner;

public class ArrayIndexOfBound {

    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in);

            String[] s = new String[5];

            try {
                for (int i = 0; i < 6; i++) {
                    s[i] = sc.nextLine();
                }

            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Array Index Out Exceeds");


            }


        }


    }
}

