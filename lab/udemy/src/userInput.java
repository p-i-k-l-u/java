import java.io.BufferedReader;
import java.io.InputStreamReader;

public class userInput
{
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the number : ");
        InputStreamReader is = new InputStreamReader(System.in);// create a object for buffer Reader
        BufferedReader br = new BufferedReader(is);//bufferReader obj

        int n = Integer.parseInt(br.readLine());// that is a method we take the input String type
        System.out.println(n);
    }
}
