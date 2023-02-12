
// Q: Keypad combination in the string ex: 23




public class Recursion10 {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str , int index , String comb)
    {
        if(index == str.length())
        {
            System.out.println(comb);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length() ;i++)
        {
            printComb(str,index+1,comb+mapping.charAt(i));

        }
    }

    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0,"");
    }
}
