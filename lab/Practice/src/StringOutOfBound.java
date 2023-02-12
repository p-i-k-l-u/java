public class StringOutOfBound {
    public static void main(String[] args) {
        String str = "PIKLU";
        try
        {
            str.charAt(7);

        }
        catch(StringIndexOutOfBoundsException a)
        {
            System.out.println("String index out of bound ");
        }
        System.out.println(str.length());
//        System.out.println(str.substring(7));
    }
}
