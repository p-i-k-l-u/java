
import java.util.Scanner;
public class combination {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            int c;
            System.out.println("Enter first digit: ");
            a = sc.nextInt();
            System.out.println("Enter second digit: ");
            b = sc.nextInt();
            System.out.println("Enter third digit: ");
            c = sc.nextInt();
            int arr[] = {a, b, c};
            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    for (int k = 0; k<3; k++){
                        if(arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]){
                            System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                        }
                    }
                }
            }

        }
    }

