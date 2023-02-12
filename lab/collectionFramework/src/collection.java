import java.util.ArrayList;

public class collection
{
    public static void main(String args[])
    {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(33);
        num.add(56);
        num.add(78);



        //System.out.println(num);

        //num.set(1,67);//set method
       // num.remove(1);

        for(int i:num)
        {
            System.out.println(i);
        }
        System.out.println(num.contains(3));


        //System.out.println(num.get(2));// get method

        //System.out.println(num);



    }
}
